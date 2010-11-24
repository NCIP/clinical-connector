/**
 * Question.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * This class is used to hold the contect data related to the definition
 * of the Question as it pertains to the study.
 */
public class Question  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement commonDataElement;
    private java.lang.String defaultPrompt;
    private int id;
    private java.lang.String name;
    private int repeatSequence;
    private gov.nih.nci.cabig.ccts.domain.bridg.QuestionValue questionValue;

    public Question() {
    }

    public Question(
           gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement commonDataElement,
           java.lang.String defaultPrompt,
           int id,
           java.lang.String name,
           gov.nih.nci.cabig.ccts.domain.bridg.QuestionValue questionValue,
           int repeatSequence) {
           this.commonDataElement = commonDataElement;
           this.defaultPrompt = defaultPrompt;
           this.id = id;
           this.name = name;
           this.repeatSequence = repeatSequence;
           this.questionValue = questionValue;
    }


    /**
     * Gets the commonDataElement value for this Question.
     * 
     * @return commonDataElement
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement getCommonDataElement() {
        return commonDataElement;
    }


    /**
     * Sets the commonDataElement value for this Question.
     * 
     * @param commonDataElement
     */
    public void setCommonDataElement(gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement commonDataElement) {
        this.commonDataElement = commonDataElement;
    }


    /**
     * Gets the defaultPrompt value for this Question.
     * 
     * @return defaultPrompt
     */
    public java.lang.String getDefaultPrompt() {
        return defaultPrompt;
    }


    /**
     * Sets the defaultPrompt value for this Question.
     * 
     * @param defaultPrompt
     */
    public void setDefaultPrompt(java.lang.String defaultPrompt) {
        this.defaultPrompt = defaultPrompt;
    }


    /**
     * Gets the id value for this Question.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Question.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Question.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Question.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the repeatSequence value for this Question.
     * 
     * @return repeatSequence
     */
    public int getRepeatSequence() {
        return repeatSequence;
    }


    /**
     * Sets the repeatSequence value for this Question.
     * 
     * @param repeatSequence
     */
    public void setRepeatSequence(int repeatSequence) {
        this.repeatSequence = repeatSequence;
    }


    /**
     * Gets the questionValue value for this Question.
     * 
     * @return questionValue
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.QuestionValue getQuestionValue() {
        return questionValue;
    }


    /**
     * Sets the questionValue value for this Question.
     * 
     * @param questionValue
     */
    public void setQuestionValue(gov.nih.nci.cabig.ccts.domain.bridg.QuestionValue questionValue) {
        this.questionValue = questionValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Question)) return false;
        Question other = (Question) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commonDataElement==null && other.getCommonDataElement()==null) || 
             (this.commonDataElement!=null &&
              this.commonDataElement.equals(other.getCommonDataElement()))) &&
            ((this.defaultPrompt==null && other.getDefaultPrompt()==null) || 
             (this.defaultPrompt!=null &&
              this.defaultPrompt.equals(other.getDefaultPrompt()))) &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.repeatSequence == other.getRepeatSequence() &&
            ((this.questionValue==null && other.getQuestionValue()==null) || 
             (this.questionValue!=null &&
              this.questionValue.equals(other.getQuestionValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCommonDataElement() != null) {
            _hashCode += getCommonDataElement().hashCode();
        }
        if (getDefaultPrompt() != null) {
            _hashCode += getDefaultPrompt().hashCode();
        }
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getRepeatSequence();
        if (getQuestionValue() != null) {
            _hashCode += getQuestionValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Question.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Question"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonDataElement");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "commonDataElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "CommonDataElement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrompt");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "defaultPrompt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "repeatSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "QuestionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "QuestionValue"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
