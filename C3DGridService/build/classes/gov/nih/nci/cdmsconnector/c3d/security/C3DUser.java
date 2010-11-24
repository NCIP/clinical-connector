package gov.nih.nci.cdmsconnector.c3d.security;

import gov.nih.nci.security.authorization.domainobjects.User;

public class C3DUser extends User implements Cloneable {
	private String c3dUserName, c3dPassword;

	public String getC3dUserName() {
		return c3dUserName;
	}

	public void setC3dUserName(String userName) {
		c3dUserName = userName;
	}

	public String getC3dPassword() {
		return c3dPassword;
	}

	public void setC3dPassword(String password) {
		c3dPassword = password;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
