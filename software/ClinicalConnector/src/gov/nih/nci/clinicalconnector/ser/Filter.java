/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.ser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.xml.namespace.QName;
import javax.xml.rpc.NamespaceConstants;

import org.apache.axis.encoding.SerializationContext;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public class Filter implements ContentHandler {
    private SerializationContext context;
    private Stack<Map<String, String>> prefixes = new Stack<Map<String, String>>();
    private Map<String, String> head = new HashMap<String, String>();
    
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		head.put(prefix, uri);
	}

	public void endPrefixMapping(String prefix) throws SAXException {
		head.remove(prefix);

	}
    
    public Filter(SerializationContext context) {
        this.context = context;
    }

	public void characters(char[] ch, int start, int length)
			throws SAXException {
        try {
            context.writeChars(ch, start, length);
        } catch (IOException ioe) {
            throw new SAXException(ioe);
        }		
	}

	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		
	}


	

	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void processingInstruction(String target, String data)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub
		
	}

	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		
	}
	
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		head = prefixes.pop();
		try {
			context.endElement();
		} catch (IOException ioe) {
			throw new SAXException(ioe);
		}
	}

	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		prefixes.push(head);
		head = new HashMap<String, String>();
		boolean namespaceDefFound = false;
		AttributesImpl fixed = new AttributesImpl();
		for (int i = 0; i < atts.getLength(); i++) {
			String au = atts.getURI(i);
			String av = atts.getValue(i);
			String aln = atts.getLocalName(i);
			if (uri.equals(av)) {
				namespaceDefFound = true;
				System.out.println("namespace found for:" + qName);
			}
			if (NamespaceConstants.NSURI_SCHEMA_XSI.equals(au)
					&& "type".equals(aln)) {
				int idx = av.indexOf(':');
				String p = av.substring(0, idx);
				String q = av.substring(av.indexOf(':') + 1);
				String ns = getNS(p);
				String axisPrefix = context.getPrefixForURI(ns);
				av = axisPrefix + ':' + q;

			}
			fixed.addAttribute(au, aln, atts.getQName(i), atts.getType(i), av);
		}
		/*if (!namespaceDefFound) {
			System.out.println("Adding xmlns attribute");
			fixed.addAttribute(null, null, "xmlns:"
					+ context.getPrefixForURI(uri), "CDATA", uri);
		}*/
		try {
			context.startElement(new QName(uri, localName), fixed);
		} catch (IOException ioe) {
			throw new SAXException(ioe);
		}

	}

	
    private String getNS(String prefix) {
        String ns = null;
        for(int i = prefixes.size() - 1; i >= 0 && ns == null; i--) {
            ns = prefixes.get(i).get(prefix);
        }
        return ns;
    }


}
