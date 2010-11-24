/**
 * EIVL_TSBirth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class EIVL_TSBirth  extends _21090.org.iso.QSET_TSBirth  implements java.io.Serializable {
    private _21090.org.iso.IVL_PQ offset;
    private _21090.org.iso.TimingEvent event;  // attribute

    public EIVL_TSBirth() {
    }

    public EIVL_TSBirth(
           _21090.org.iso.TimingEvent event,
           _21090.org.iso.IVL_PQ offset) {
           this.offset = offset;
           this.event = event;
    }


    /**
     * Gets the offset value for this EIVL_TSBirth.
     * 
     * @return offset
     */
    public _21090.org.iso.IVL_PQ getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this EIVL_TSBirth.
     * 
     * @param offset
     */
    public void setOffset(_21090.org.iso.IVL_PQ offset) {
        this.offset = offset;
    }


    /**
     * Gets the event value for this EIVL_TSBirth.
     * 
     * @return event
     */
    public _21090.org.iso.TimingEvent getEvent() {
        return event;
    }


    /**
     * Sets the event value for this EIVL_TSBirth.
     * 
     * @param event
     */
    public void setEvent(_21090.org.iso.TimingEvent event) {
        this.event = event;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EIVL_TSBirth)) return false;
        EIVL_TSBirth other = (EIVL_TSBirth) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              this.event.equals(other.getEvent())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getEvent() != null) {
            _hashCode += getEvent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EIVL_TSBirth.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "EIVL_TS.Birth"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("event");
        attrField.setXmlName(new javax.xml.namespace.QName("", "event"));
        attrField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "TimingEvent"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "IVL_PQ"));
        elemField.setMinOccurs(0);
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
