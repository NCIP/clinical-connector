package gov.nih.nci.clinicalconnector.manager;

public class AccessPermissionException extends Exception{

    /**
     * 
     */
    public AccessPermissionException() {
        super();
    }

    /**
     * @param arg0
     */
    public AccessPermissionException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     */
    public AccessPermissionException(Throwable arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     * @param arg1
     */
    public AccessPermissionException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

}
