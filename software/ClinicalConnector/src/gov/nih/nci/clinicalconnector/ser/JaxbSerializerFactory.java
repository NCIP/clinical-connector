/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.ser;

import javax.xml.namespace.QName;

import org.apache.axis.encoding.ser.BaseSerializerFactory;

/**
 * @author marwahah
 *
 */
public class JaxbSerializerFactory extends BaseSerializerFactory {

	private static final long serialVersionUID = -8774309569948608967L;


    public JaxbSerializerFactory(Class javaType, QName xmlType) {
        super(JaxbSerializer.class, xmlType, javaType);
    }


	/*public JaxbSerializerFactory(Class serClass) {
		super(serClass);
		// TODO Auto-generated constructor stub
	}*/

	/**
	 *
	 */

}
