/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.util;

import java.lang.Exception;
public class ServiceLocatorException extends Exception
{
  public ServiceLocatorException( Exception e)
  {
    super(e.getMessage());
  }
}
