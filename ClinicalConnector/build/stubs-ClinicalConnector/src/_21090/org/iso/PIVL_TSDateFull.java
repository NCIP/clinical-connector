/**
 * PIVL_TSDateFull.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class PIVL_TSDateFull  extends _21090.org.iso.QSET_TSDateFull  implements java.io.Serializable {
    private _21090.org.iso.IVL_TSDateFull phase;
    private _21090.org.iso.PQ period;
    private _21090.org.iso.CalendarCycle alignment;  // attribute
    private java.lang.Boolean institutionSpecified;  // attribute

    public PIVL_TSDateFull() {
    }

    public PIVL_TSDateFull(
           _21090.org.iso.CalendarCycle alignment,
           java.lang.Boolean institutionSpecified,
           _21090.org.iso.PQ period,
           _21090.org.iso.IVL_TSDateFull phase) {
           this.phase = phase;
           this.period = period;
           this.alignment = alignment;
           this.institutionSpecified = institutionSpecified;
    }


    /**
     * Gets the phase value for this PIVL_TSDateFull.
     * 
     * @return phase
     */
    public _21090.org.iso.IVL_TSDateFull getPhase() {
        return phase;
    }


    /**
     * Sets the phase value for this PIVL_TSDateFull.
     * 
     * @param phase
     */
    public void setPhase(_21090.org.iso.IVL_TSDateFull phase) {
        this.phase = phase;
    }


    /**
     * Gets the period value for this PIVL_TSDateFull.
     * 
     * @return period
     */
    public _21090.org.iso.PQ getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this PIVL_TSDateFull.
     * 
     * @param period
     */
    public void setPeriod(_21090.org.iso.PQ period) {
        this.period = period;
    }


    /**
     * Gets the alignment value for this PIVL_TSDateFull.
     * 
     * @return alignment
     */
    public _21090.org.iso.CalendarCycle getAlignment() {
        return alignment;
    }


    /**
     * Sets the alignment value for this PIVL_TSDateFull.
     * 
     * @param alignment
     */
    public void setAlignment(_21090.org.iso.CalendarCycle alignment) {
        this.alignment = alignment;
    }


    /**
     * Gets the institutionSpecified value for this PIVL_TSDateFull.
     * 
     * @return institutionSpecified
     */
    public java.lang.Boolean getInstitutionSpecified() {
        return institutionSpecified;
    }


    /**
     * Sets the institutionSpecified value for this PIVL_TSDateFull.
     * 
     * @param institutionSpecified
     */
    public void setInstitutionSpecified(java.lang.Boolean institutionSpecified) {
        this.institutionSpecified = institutionSpecified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PIVL_TSDateFull)) return false;
        PIVL_TSDateFull other = (PIVL_TSDateFull) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.phase==null && other.getPhase()==null) || 
             (this.phase!=null &&
              this.phase.equals(other.getPhase()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.alignment==null && other.getAlignment()==null) || 
             (this.alignment!=null &&
              this.alignment.equals(other.getAlignment()))) &&
            ((this.institutionSpecified==null && other.getInstitutionSpecified()==null) || 
             (this.institutionSpecified!=null &&
              this.institutionSpecified.equals(other.getInstitutionSpecified())));
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
        if (getPhase() != null) {
            _hashCode += getPhase().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getAlignment() != null) {
            _hashCode += getAlignment().hashCode();
        }
        if (getInstitutionSpecified() != null) {
            _hashCode += getInstitutionSpecified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PIVL_TSDateFull.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "PIVL_TS.Date.Full"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("alignment");
        attrField.setXmlName(new javax.xml.namespace.QName("", "alignment"));
        attrField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "CalendarCycle"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("institutionSpecified");
        attrField.setXmlName(new javax.xml.namespace.QName("", "institutionSpecified"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phase");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "phase"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "IVL_TS.Date.Full"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iso.org:21090", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", "PQ"));
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
