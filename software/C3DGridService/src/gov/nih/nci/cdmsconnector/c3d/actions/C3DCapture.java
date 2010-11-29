package gov.nih.nci.cdmsconnector.c3d.actions;

import gov.nih.nci.cdmsconnector.capture.C3DCaptureManager;
import gov.nih.nci.cdmsconnector.dao.BaseJDBCDAO;
import gov.nih.nci.cdmsconnector.manager.AccessPermissionException;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class C3DCapture extends ActionSupport {
	private final static Logger log = Logger.getLogger(C3DCapture.class.getName());

	//private String study, patientId, hotLink, patientPosition, remember;
	//private boolean remember;
	private C3DCaptureManager captureManager;
	private String gridIdName, gridIdPass, c3dUsername, c3dPassword;
	private String message, command;

	public String execute() throws Exception {
		log.debug("Capturing C3D Userid");
		
		//System.out.println("C3D Capture is Running");
		//System.out.println("gridIdName= '" + gridIdName + "'");
		//System.out.println("gridIdPass= '" + gridIdPass + "'");
		//System.out.println("c3dUsername= '" + c3dUsername + "'");
		//System.out.println("c3dPassword= '" + c3dPassword + "'");
		//System.out.println("command= '" + command + "'");
		
        message = "";
        
		if (gridIdName == null || gridIdPass == null || 
				c3dUsername == null || c3dPassword == null ||
				"".equals(gridIdName) || "".equals(gridIdPass) || 
				"".equals(c3dUsername) || "".equals(c3dPassword)) {

			setMessage("All fields must be entered.");
			return ERROR;
		}
		
		if (command == null|| "".equals(command)) {
			message = "No command given!  Must choose 'Save' or 'Verify'";
			return ERROR;
		}
		
		if ("verify".equals(command)) {

			//System.out.println("'command really does = 'verify'");

			try {
				BaseJDBCDAO.getConnection(c3dUsername, c3dPassword).close();

				setMessage("C3D Userid '" + c3dUsername + "' has successfully Verified.");
				
				return LOGIN;
				
				} catch (Exception e) {
					e.printStackTrace();
					setMessage("Bad C3D Username/Password.");
					return ERROR;
			}
		}

		if ("save".equals(command)) {
				
			try {
				BaseJDBCDAO.getConnection(c3dUsername, c3dPassword).close();

				//System.out.println("Userid and Password are Valid");
				
			} catch (Exception e) {
				e.printStackTrace();
				setMessage("Bad C3D Username/Password.");
				return ERROR;
			}

			try {
				message = captureManager.getCapture(gridIdName, gridIdPass, 
						c3dUsername, c3dPassword);
			} catch (AccessPermissionException e) {
				e.printStackTrace();
				setMessage(message);
				return ERROR;
			}

		}
		return SUCCESS;
		
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String iCommand) {
		command = iCommand;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String iMessage) {
		message = iMessage;
	}

	public String getC3dUsername() {
		return c3dUsername;
	}

	public void setC3dUsername(String userName) {
		c3dUsername = userName;
	}

	public String getC3dPassword() {
		return c3dPassword;
	}

	public void setC3dPassword(String password) {
		c3dPassword = password;
	}

	public String getGridIdName() {
		return gridIdName;
	}

	public void setGridIdName(String gIdName) {
		gridIdName = gIdName;
	}
	
	public String getGridIdPass() {
		return gridIdName;
	}

	public void setGridIdPass(String gpassword) {
		gridIdPass = gpassword;
	}

	public C3DCaptureManager getCaptureManager() {
		return captureManager;
	}

	public void setCaptureManager(C3DCaptureManager c3dCaptureManager) {
		this.captureManager = c3dCaptureManager;
	}

	
}
