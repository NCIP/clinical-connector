package gov.nih.nci.cdmsconnector.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import gov.nih.nci.cdmsconnector.dao.BaseJDBCDAO;
import oracle.jdbc.driver.OracleDriver;

public class StringEncrypter {

	public static final String	DESEDE_ENCRYPTION_SCHEME	= "DESede";

	public static final String	DES_ENCRYPTION_SCHEME		= "DES";

	public static final String	DEFAULT_ENCRYPTION_KEY		= "12C3PR34567890ENCRYPTIONC3PR4KEY5678901234567890";

	private KeySpec				keySpec;

	private SecretKeyFactory	keyFactory;

	private Cipher				cipher;

	private static final String	UNICODE_FORMAT				= "UTF8";

	protected static final String ENCRYPT =
		"SELECT  getEncrypt(?,?,?,?) OUTSTRING from dual";
	protected static final String DECRYPT =
		"SELECT  getDecrypt(?,?,?,?) OUTSTRING from dual";


	public StringEncrypter() throws EncryptionException {
		this(DES_ENCRYPTION_SCHEME, DEFAULT_ENCRYPTION_KEY);
	}
	
	public StringEncrypter(String encryptionScheme) throws EncryptionException {
		this(encryptionScheme, DEFAULT_ENCRYPTION_KEY);
	}

	public StringEncrypter(String encryptionScheme, String encryptionKey) throws EncryptionException {

		if (encryptionKey == null)
			throw new IllegalArgumentException("encryption key was null");
		if (encryptionKey.trim().length() < 24)
			throw new IllegalArgumentException("encryption key was less than 24 characters");

		try {
			byte[] keyAsBytes = encryptionKey.getBytes(UNICODE_FORMAT);

			if (encryptionScheme.equals(DESEDE_ENCRYPTION_SCHEME)) {
				keySpec = new DESedeKeySpec(keyAsBytes);
			} else
				if (encryptionScheme.equals(DES_ENCRYPTION_SCHEME)) {
					keySpec = new DESKeySpec(keyAsBytes);
				} else {
					throw new IllegalArgumentException("Encryption scheme not supported: " + encryptionScheme);
				}

			keyFactory = SecretKeyFactory.getInstance(encryptionScheme);
			cipher = Cipher.getInstance(encryptionScheme);

		} catch (InvalidKeyException e) {
			throw new EncryptionException(e);
		} catch (UnsupportedEncodingException e) {
			throw new EncryptionException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new EncryptionException(e);
		} catch (NoSuchPaddingException e) {
			throw new EncryptionException(e);
		}

	}

	public String jEncrypt(String unencryptedString) throws EncryptionException {
		if (unencryptedString == null || unencryptedString.trim().length() == 0)
			throw new IllegalArgumentException("unencrypted string was null or empty");

		try {
			SecretKey key = keyFactory.generateSecret(keySpec);
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] cleartext = unencryptedString.getBytes(UNICODE_FORMAT);
			byte[] ciphertext = cipher.doFinal(cleartext);

			BASE64Encoder base64encoder = new BASE64Encoder();
			return base64encoder.encode(ciphertext);
		} catch (Exception e) {
			throw new EncryptionException(e);
		}
	}

	public String jDecrypt(String encryptedString) throws EncryptionException {
		if (encryptedString == null || encryptedString.trim().length() <= 0)
			throw new IllegalArgumentException("encrypted string was null or empty");

		try {
			SecretKey key = keyFactory.generateSecret(keySpec);
			cipher.init(Cipher.DECRYPT_MODE, key);
			BASE64Decoder base64decoder = new BASE64Decoder();
			byte[] cleartext = base64decoder.decodeBuffer(encryptedString);
			byte[] ciphertext = cipher.doFinal(cleartext);

			return bytes2String(ciphertext);
		} catch (Exception e) {
			throw new EncryptionException(e);
		}
	}

	private static String bytes2String(byte[] bytes) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			stringBuffer.append((char) bytes[i]);
		}
		return stringBuffer.toString();
	}

	public static class EncryptionException extends Exception {
		public EncryptionException(Throwable t) {
			super(t);
		}
	}
	public String oEncrypt(String unencryptedString) throws EncryptionException {
		PreparedStatement stmt1 = null;
		Connection cn = null;
		String encryptedString = null;

		// Encrypt Password
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = gov.nih.nci.cdmsconnector.dao.BaseJDBCDAO.getConnection();

			// Find the Grid User
			stmt1 = cn.prepareStatement(ENCRYPT);
			stmt1.setString(1, unencryptedString);
			stmt1.setString(2, DEFAULT_ENCRYPTION_KEY);
			stmt1.setString(3, DES_ENCRYPTION_SCHEME);
			stmt1.setString(4, "1");

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				encryptedString = rs1.getString("OUTSTRING");
			}
			stmt1.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			cn.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}

        return unencryptedString;
	}	
	public String oEncrypt(String unencryptedString, String dUser, String dPass, String dDB) throws EncryptionException {
		PreparedStatement stmt1 = null;
		Connection cn = null;
		String encryptedString = null;

		// Encrypt Password
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection(dDB,dUser, dPass);

			// Find the Grid User
			stmt1 = cn.prepareStatement(ENCRYPT);
			stmt1.setString(1, unencryptedString);
			stmt1.setString(2, DEFAULT_ENCRYPTION_KEY);
			stmt1.setString(3, DES_ENCRYPTION_SCHEME);
			stmt1.setString(4, "1");

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				encryptedString = rs1.getString("OUTSTRING");;
			}
			stmt1.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			cn.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}
        return encryptedString;
	}

	public String oDecrypt(String encryptedString) throws EncryptionException {
		PreparedStatement stmt1 = null;
		Connection cn = null;
		String unencryptedString = null;

		// Decrypt Password
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = gov.nih.nci.cdmsconnector.dao.BaseJDBCDAO.getConnection();

			// Find the Grid User
			stmt1 = cn.prepareStatement(DECRYPT);
			stmt1.setString(1, encryptedString);
			stmt1.setString(2, DEFAULT_ENCRYPTION_KEY);
			stmt1.setString(3, DES_ENCRYPTION_SCHEME);
			stmt1.setString(4, "1");

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				unencryptedString = rs1.getString("OUTSTRING");
			}
			stmt1.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			cn.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}

        return unencryptedString;
	}	

	public String oDecrypt(String encryptedString, String dUser, String dPass, String dDB) throws EncryptionException {
		PreparedStatement stmt1 = null;
		Connection cn = null;
		String unencryptedString = null;

		// Decrypt Password
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection(dDB,dUser, dPass);

			// Find the Grid User
			stmt1 = cn.prepareStatement(DECRYPT);
			stmt1.setString(1, encryptedString);
			stmt1.setString(2, DEFAULT_ENCRYPTION_KEY);
			stmt1.setString(3, DES_ENCRYPTION_SCHEME);
			stmt1.setString(4, "1");

			ResultSet rs1 = stmt1.executeQuery();

			while (rs1.next()) {
				unencryptedString = rs1.getString("OUTSTRING");
			}
			stmt1.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			cn.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}

        return unencryptedString;
	}	
	
    public static void helpMessage() {

		System.out.println("String Encrypter");
		System.out.println("     ");
		System.out.println("     Used to Encrypt or Decrypt a character string.");
		System.out.println("  Usage: java StringEncrypter ");
		System.out.println("         jEncrypt [string] - Returns encrypted string using javax.crypto DES" );
		System.out.println("         jDecrypt [string] - Returns decrypted string using javax.crypto DES" );
		System.out.println("         oEncrypt [string] [user] [pass] [db] - Returns encrypted string using Oracle DES3" );
		System.out.println("         oDecrypt [string] [user] [pass] [db] - Returns decrypted string using Oracle DES3" );
		System.out.println("  ");
	}


	public static void main(String args[]){

    	if (args.length == 0) {
				helpMessage();
				System.exit(0);
		}

		if (args[0] == null || "".equals(args[0]) ||
			"HELP".equals(args[0].toUpperCase()) ||
			"/H".equals(args[0].toUpperCase() )) {
			helpMessage();
			System.exit(0);
        }

		if ( ("JENCRYPT".equals(args[0].toUpperCase()) ||
		      "JDECRYPT".equals(args[0].toUpperCase()) ) && args.length < 2) {

			System.out.println("Two parameter are require when using jEncrypt or jDecrypt.");
			System.exit(0);
	    }

		if ( ("OENCRYPT".equals(args[0].toUpperCase()) ||
		      "ODECRYPT".equals(args[0].toUpperCase()) ) && args.length < 5) {

			System.out.println("Five parameter are require when using oEncrypt or oDecrypt.");
			System.exit(0);
	    }
		try{
			StringEncrypter se = new StringEncrypter();


			if ( "JENCRYPT".equals(args[0].toUpperCase())) {
				if (args[1] == null || "".equals(args[1])) {
					System.out.println("No string specified.  Use 'help' for more information.");
				} else {
					System.out.println( se.jEncrypt(args[1]) );
				}
			}

			if ( "JDECRYPT".equals(args[0].toUpperCase()) ) {
				if (args[1] == null || "".equals(args[1])) {
					System.out.println("No string specified.  Use 'help' for more information.");
				} else {
					System.out.println( se.jDecrypt(args[1]) );
				}
			}

			if ( "OENCRYPT".equals(args[0].toUpperCase()) ) {
				if (args[1] == null || "".equals(args[1])) {
					System.out.println("No string specified.  Use 'help' for more information.");
				} else {
					System.out.println( se.oEncrypt(args[1],args[2],args[3],args[4]) );
				}
			}

			if ( "ODECRYPT".equals(args[0].toUpperCase()) ) {
				if (args[1] == null || "".equals(args[1])) {
					System.out.println("No string specified.  Use 'help' for more information.");
				} else {
					System.out.println( se.oDecrypt(args[1],args[2],args[3],args[4]) );
				}
			}

			if ( "OHELP".equals(args[0].toUpperCase()) ) {
					System.out.println("Sample jdbc thin - jdbc:oracle:thin:@cbiodb2.nci.nih.gov:1521:ocdev");
			} else {
				helpMessage();
			}

		}catch(Throwable e){
			e.printStackTrace();
		}
}

}

