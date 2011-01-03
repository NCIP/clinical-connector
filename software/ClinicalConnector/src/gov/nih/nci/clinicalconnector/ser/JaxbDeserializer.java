package gov.nih.nci.clinicalconnector.ser;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.DeserializerImpl;
import org.apache.axis.message.MessageElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

public class JaxbDeserializer extends DeserializerImpl implements Deserializer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4221224350619839734L;
	
    private static final Map<String, Object> MAP = new HashMap<String, Object>();
    private final Class javaType;
    private static final Logger logger = LogManager.getLogger(JaxbDeserializer.class);
    
    public JaxbDeserializer(Class javaType, QName xmlType)
    {
        this.javaType = javaType;
    }
    
    public void onEndElement(String namespace, String localName, DeserializationContext context)
    throws SAXException
{
    try
    {
        MessageElement msgElem = context.getCurElement();
        if(msgElem != null)
        {
            JAXBContext jc = (JAXBContext)MAP.get(javaType.getPackage().getName());
            if(jc == null)
            {
                jc = JAXBContext.newInstance(javaType.getPackage().getName());
                MAP.put(javaType.getPackage().getName(), jc);
            }
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            value = unmarshaller.unmarshal(msgElem.getAsDOM());
        }
    }
    catch(Exception e)
    {
    	logger.error("Error deserializing:"+namespace+":"+localName,e);
        throw new SAXException("Error deserializing:"+namespace+":"+localName,e);
    }
}

}
