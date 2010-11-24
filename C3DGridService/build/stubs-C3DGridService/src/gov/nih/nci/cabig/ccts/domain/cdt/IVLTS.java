/**
 * IVLTS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.cdt;


/**
 * An complex timing specification that defines an interval of time.
 */
public class IVLTS  implements java.io.Serializable {
    /** The exact middle point of the interval. */
    private java.util.Calendar center;
    /** The high limit of the interval. */
    private java.util.Calendar high;
    /** Specifies whether the limit is included in the interval (interval
 * is closed) or excluded from the interval (interval is open). */
    private boolean highInclusive;
    /** The low limit of the interval. */
    private java.util.Calendar low;
    /** Specifies whether the limit is included in the interval (interval
 * is closed) or excluded from the interval (interval is open). */
    private boolean lowInclusive;
    /** A code specifying whether the set component is included (union)
 * or excluded (set-difference) from the set, or other set operations
 * with the current set component and the set as constructed from the
 * representation stream up to the current point. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD operator;
    /** The difference between high and low boundary. The purpose of distinguishing
 * a width property is to handle all cases of incomplete information
 * symmetrically. In any interval representation only two of the three
 * properties high, low, and width need to be stated and the third can
 * be derived. */
    private gov.nih.nci.cabig.ccts.domain.cdt.PQ width;

    public IVLTS() {
    }

    public IVLTS(
           java.util.Calendar center,
           java.util.Calendar high,
           boolean highInclusive,
           java.util.Calendar low,
           boolean lowInclusive,
           gov.nih.nci.cabig.ccts.domain.cdt.CD operator,
           gov.nih.nci.cabig.ccts.domain.cdt.PQ width) {
           this.center = center;
           this.high = high;
           this.highInclusive = highInclusive;
           this.low = low;
           this.lowInclusive = lowInclusive;
           this.operator = operator;
           this.width = width;
    }


    /**
     * Gets the center value for this IVLTS.
     * 
     * @return center The exact middle point of the interval.
     */
    public java.util.Calendar getCenter() {
        return center;
    }


    /**
     * Sets the center value for this IVLTS.
     * 
     * @param center The exact middle point of the interval.
     */
    public void setCenter(java.util.Calendar center) {
        this.center = center;
    }


    /**
     * Gets the high value for this IVLTS.
     * 
     * @return high The high limit of the interval.
     */
    public java.util.Calendar getHigh() {
        return high;
    }


    /**
     * Sets the high value for this IVLTS.
     * 
     * @param high The high limit of the interval.
     */
    public void setHigh(java.util.Calendar high) {
        this.high = high;
    }


    /**
     * Gets the highInclusive value for this IVLTS.
     * 
     * @return highInclusive Specifies whether the limit is included in the interval (interval
 * is closed) or excluded from the interval (interval is open).
     */
    public boolean isHighInclusive() {
        return highInclusive;
    }


    /**
     * Sets the highInclusive value for this IVLTS.
     * 
     * @param highInclusive Specifies whether the limit is included in the interval (interval
 * is closed) or excluded from the interval (interval is open).
     */
    public void setHighInclusive(boolean highInclusive) {
        this.highInclusive = highInclusive;
    }


    /**
     * Gets the low value for this IVLTS.
     * 
     * @return low The low limit of the interval.
     */
    public java.util.Calendar getLow() {
        return low;
    }


    /**
     * Sets the low value for this IVLTS.
     * 
     * @param low The low limit of the interval.
     */
    public void setLow(java.util.Calendar low) {
        this.low = low;
    }


    /**
     * Gets the lowInclusive value for this IVLTS.
     * 
     * @return lowInclusive Specifies whether the limit is included in the interval (interval
 * is closed) or excluded from the interval (interval is open).
     */
    public boolean isLowInclusive() {
        return lowInclusive;
    }


    /**
     * Sets the lowInclusive value for this IVLTS.
     * 
     * @param lowInclusive Specifies whether the limit is included in the interval (interval
 * is closed) or excluded from the interval (interval is open).
     */
    public void setLowInclusive(boolean lowInclusive) {
        this.lowInclusive = lowInclusive;
    }


    /**
     * Gets the operator value for this IVLTS.
     * 
     * @return operator A code specifying whether the set component is included (union)
 * or excluded (set-difference) from the set, or other set operations
 * with the current set component and the set as constructed from the
 * representation stream up to the current point.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this IVLTS.
     * 
     * @param operator A code specifying whether the set component is included (union)
 * or excluded (set-difference) from the set, or other set operations
 * with the current set component and the set as constructed from the
 * representation stream up to the current point.
     */
    public void setOperator(gov.nih.nci.cabig.ccts.domain.cdt.CD operator) {
        this.operator = operator;
    }


    /**
     * Gets the width value for this IVLTS.
     * 
     * @return width The difference between high and low boundary. The purpose of distinguishing
 * a width property is to handle all cases of incomplete information
 * symmetrically. In any interval representation only two of the three
 * properties high, low, and width need to be stated and the third can
 * be derived.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.PQ getWidth() {
        return width;
    }


    /**
     * Sets the width value for this IVLTS.
     * 
     * @param width The difference between high and low boundary. The purpose of distinguishing
 * a width property is to handle all cases of incomplete information
 * symmetrically. In any interval representation only two of the three
 * properties high, low, and width need to be stated and the third can
 * be derived.
     */
    public void setWidth(gov.nih.nci.cabig.ccts.domain.cdt.PQ width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IVLTS)) return false;
        IVLTS other = (IVLTS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.center==null && other.getCenter()==null) || 
             (this.center!=null &&
              this.center.equals(other.getCenter()))) &&
            ((this.high==null && other.getHigh()==null) || 
             (this.high!=null &&
              this.high.equals(other.getHigh()))) &&
            this.highInclusive == other.isHighInclusive() &&
            ((this.low==null && other.getLow()==null) || 
             (this.low!=null &&
              this.low.equals(other.getLow()))) &&
            this.lowInclusive == other.isLowInclusive() &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getCenter() != null) {
            _hashCode += getCenter().hashCode();
        }
        if (getHigh() != null) {
            _hashCode += getHigh().hashCode();
        }
        _hashCode += (isHighInclusive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLow() != null) {
            _hashCode += getLow().hashCode();
        }
        _hashCode += (isLowInclusive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IVLTS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "IVLTS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("center");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "center"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "high"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highInclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "highInclusive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "low"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowInclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "lowInclusive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "PQ"));
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
