package gov.nih.nci.clinicalconnector.ser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.wsdl.fromJava.Types;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;

public class JaxbSerializer implements Serializer{

	/**
	 *
	 */
	private static final long serialVersionUID = -8236269930004267473L;
	private static final Map<String, Object> MAP = new HashMap<String, Object>();
	private static final Logger logger = LogManager.getLogger(JaxbSerializer.class);

	public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {
        try
        {
            JAXBContext jaxbContext = (JAXBContext)MAP.get(value.getClass().getPackage().getName());
            if(jaxbContext == null)
            {
                jaxbContext = JAXBContext.newInstance(value.getClass().getPackage().getName());
                MAP.put(value.getClass().getPackage().getName(), jaxbContext);
            }
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty("jaxb.fragment", Boolean.TRUE);
            marshaller.marshal(value, new Filter(context));
        }
        catch(Exception e)
        {
            logger.error("Error serializing:"+name+" ",e);
            throw new IOException("Error serializing:"+name+" "+e.getMessage());
        }
	}

	public Element writeSchema(Class arg0, Types arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMechanismType() {
		return "Axis SAX Mechanism";
	}

}
