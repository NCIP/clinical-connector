/**
 * TimeToLive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cagrid.gts.bean;

public class TimeToLive  implements java.io.Serializable {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeToLive() {
    }

    public TimeToLive(
           int hours,
           int minutes,
           int seconds) {
           this.hours = hours;
           this.minutes = minutes;
           this.seconds = seconds;
    }


    /**
     * Gets the hours value for this TimeToLive.
     * 
     * @return hours
     */
    public int getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this TimeToLive.
     * 
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }


    /**
     * Gets the minutes value for this TimeToLive.
     * 
     * @return minutes
     */
    public int getMinutes() {
        return minutes;
    }


    /**
     * Sets the minutes value for this TimeToLive.
     * 
     * @param minutes
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


    /**
     * Gets the seconds value for this TimeToLive.
     * 
     * @return seconds
     */
    public int getSeconds() {
        return seconds;
    }


    /**
     * Sets the seconds value for this TimeToLive.
     * 
     * @param seconds
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeToLive)) return false;
        TimeToLive other = (TimeToLive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.hours == other.getHours() &&
            this.minutes == other.getMinutes() &&
            this.seconds == other.getSeconds();
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
        _hashCode += getHours();
        _hashCode += getMinutes();
        _hashCode += getSeconds();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeToLive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "TimeToLive"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "minutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cagrid.nci.nih.gov/8/gts", "seconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
