/*
 * StudyAccessException.java
 * Created on Jul 18, 2005
 */
package gov.nih.nci.cdmsconnector.manager;

/**
 * TODO Add comments.
 * @author griffinch
 */
public class StudyAccessException extends Exception {

    /**
     * 
     */
    public StudyAccessException() {
        super();
    }

    /**
     * @param arg0
     */
    public StudyAccessException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     */
    public StudyAccessException(Throwable arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     * @param arg1
     */
    public StudyAccessException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

}
