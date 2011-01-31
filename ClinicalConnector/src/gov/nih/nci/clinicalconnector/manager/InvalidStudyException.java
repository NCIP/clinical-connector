/*
 * InvalidStudyException.java
 */
package gov.nih.nci.clinicalconnector.manager;

/**
 * TODO Add comments.
 * @author pconrad
 */
public class InvalidStudyException extends Exception {

    /**
     * 
     */
    public InvalidStudyException() {
        super();
    }

    /**
     * @param arg0
     */
    public InvalidStudyException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     */
    public InvalidStudyException(Throwable arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     * @param arg1
     */
    public InvalidStudyException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

}
