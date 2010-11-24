/*
 * InvalidRequestException.java
 * Created on Jul 25, 2005
 */
package gov.nih.nci.cdmsconnector.manager;

public class InvalidRequestException extends Exception {

    /**
     * 
     */
    public InvalidRequestException() {
        super();
    }

    /**
     * @param arg0
     */
    public InvalidRequestException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     */
    public InvalidRequestException(Throwable arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     * @param arg1
     */
    public InvalidRequestException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

}
