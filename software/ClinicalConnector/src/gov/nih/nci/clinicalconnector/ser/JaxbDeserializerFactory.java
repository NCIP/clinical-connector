/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.ser;

import javax.xml.namespace.QName;

import org.apache.axis.encoding.ser.BaseDeserializerFactory;

public class JaxbDeserializerFactory extends BaseDeserializerFactory {

    public JaxbDeserializerFactory(Class javaType, QName xmlType) {
        super(JaxbDeserializer.class, xmlType, javaType);
    }

	/**
	 *
	 */
	private static final long serialVersionUID = -4295182701712674926L;

}
