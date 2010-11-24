/**
 * DefinedStudyCell.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A study cell is associated with a particular arm and epoch.  It
 * describes that portion of a particular arm (a planned path through
 * the study) which describes, for a particular epoch (study state),
 * what activities the subject will be involved in.   A concept hat 
 * frequently occurs in studies and therefore is called out as a reusable
 * template and may be used in a defined study
 */
public class DefinedStudyCell  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegmentStudyCellRule[] definedStudySegmentStudyCellRule;

    public DefinedStudyCell() {
    }

    public DefinedStudyCell(
           gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegmentStudyCellRule[] definedStudySegmentStudyCellRule) {
           this.definedStudySegmentStudyCellRule = definedStudySegmentStudyCellRule;
    }


    /**
     * Gets the definedStudySegmentStudyCellRule value for this DefinedStudyCell.
     * 
     * @return definedStudySegmentStudyCellRule
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegmentStudyCellRule[] getDefinedStudySegmentStudyCellRule() {
        return definedStudySegmentStudyCellRule;
    }


    /**
     * Sets the definedStudySegmentStudyCellRule value for this DefinedStudyCell.
     * 
     * @param definedStudySegmentStudyCellRule
     */
    public void setDefinedStudySegmentStudyCellRule(gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegmentStudyCellRule[] definedStudySegmentStudyCellRule) {
        this.definedStudySegmentStudyCellRule = definedStudySegmentStudyCellRule;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegmentStudyCellRule getDefinedStudySegmentStudyCellRule(int i) {
        return this.definedStudySegmentStudyCellRule[i];
    }

    public void setDefinedStudySegmentStudyCellRule(int i, gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudySegmentStudyCellRule _value) {
        this.definedStudySegmentStudyCellRule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedStudyCell)) return false;
        DefinedStudyCell other = (DefinedStudyCell) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.definedStudySegmentStudyCellRule==null && other.getDefinedStudySegmentStudyCellRule()==null) || 
             (this.definedStudySegmentStudyCellRule!=null &&
              java.util.Arrays.equals(this.definedStudySegmentStudyCellRule, other.getDefinedStudySegmentStudyCellRule())));
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
        if (getDefinedStudySegmentStudyCellRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinedStudySegmentStudyCellRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinedStudySegmentStudyCellRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefinedStudyCell.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudyCell"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definedStudySegmentStudyCellRule");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudySegmentStudyCellRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudySegmentStudyCellRule"));
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
