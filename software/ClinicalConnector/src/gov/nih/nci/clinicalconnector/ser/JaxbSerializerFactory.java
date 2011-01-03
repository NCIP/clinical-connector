/**
 *
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
