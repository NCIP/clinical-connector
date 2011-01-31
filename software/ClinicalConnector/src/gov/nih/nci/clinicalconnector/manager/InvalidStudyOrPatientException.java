/*
 * InvalidStudyOrPatientException.java
 * Created on Aug 5, 2005
 */
package gov.nih.nci.clinicalconnector.manager;

/**
 * TODO Add comments.
 * @author griffinch
 */
public class InvalidStudyOrPatientException extends Exception {

    /**
     * 
     */
    public InvalidStudyOrPatientException() {
        super();
    }

    /**
     * @param arg0
     */
    public InvalidStudyOrPatientException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     */
    public InvalidStudyOrPatientException(Throwable arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     * @param arg1
     */
    public InvalidStudyOrPatientException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

}