package gov.nih.nci.cdmsconnector.util;

import java.lang.Exception;
public class ServiceLocatorException extends Exception
{
  public ServiceLocatorException( Exception e)
  {
    super(e.getMessage());
  }
}