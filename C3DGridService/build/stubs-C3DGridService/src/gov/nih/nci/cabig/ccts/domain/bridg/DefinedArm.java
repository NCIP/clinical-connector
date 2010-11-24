/**
 * DefinedArm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * A planned path through the study which describes, epoch by epoch,
 * what activities the subject will be involved in as they pass through
 * the study.  The group of subjects assigned to an Arm is often called
 * a treatment group.   Arms occurs in studies and therefore is called
 * out as a reusable template.
 * 
 * For example, a study could have 2 arms named IV-Oral and Oral-IV.
 * The name IV-Oral reflects a path that passes through IV treatment,
 * then Oral treatment.
 */
public class DefinedArm  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudyCell[] definedStudyCell;

    public DefinedArm() {
    }

    public DefinedArm(
           gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudyCell[] definedStudyCell) {
           this.definedStudyCell = definedStudyCell;
    }


    /**
     * Gets the definedStudyCell value for this DefinedArm.
     * 
     * @return definedStudyCell
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudyCell[] getDefinedStudyCell() {
        return definedStudyCell;
    }


    /**
     * Sets the definedStudyCell value for this DefinedArm.
     * 
     * @param definedStudyCell
     */
    public void setDefinedStudyCell(gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudyCell[] definedStudyCell) {
        this.definedStudyCell = definedStudyCell;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudyCell getDefinedStudyCell(int i) {
        return this.definedStudyCell[i];
    }

    public void setDefinedStudyCell(int i, gov.nih.nci.cabig.ccts.domain.bridg.DefinedStudyCell _value) {
        this.definedStudyCell[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinedArm)) return false;
        DefinedArm other = (DefinedArm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.definedStudyCell==null && other.getDefinedStudyCell()==null) || 
             (this.definedStudyCell!=null &&
              java.util.Arrays.equals(this.definedStudyCell, other.getDefinedStudyCell())));
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
        if (getDefinedStudyCell() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinedStudyCell());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinedStudyCell(), i);
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
        new org.apache.axis.description.TypeDesc(DefinedArm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedArm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definedStudyCell");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudyCell"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DefinedStudyCell"));
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
