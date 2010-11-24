/**
 * ActivityRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The semantic link between activities. 
 * 
 * For example, measure blood pressure before taking Pharmacokinetics
 * (PK) sample.
 * 
 * NOTE: An activity relationship might be sequential in that one activity
 * precedes another activity. There may also be activities that have
 * different priorities and this helps determine which activity to choose
 * in the case of limited resources.
 * 
 * NOTE: Trial Design Model (TDM) Activity Rule: A rule which controls
 * when or whether an Activity is to be performed based the performance
 * or result of another Activity. For example, measure blood pressure
 * before taking PK sample.
 */
public class ActivityRelationship  implements java.io.Serializable {
    private gov.nih.nci.cabig.ccts.domain.bridg.Activity activity;
    private gov.nih.nci.cabig.ccts.domain.bridg.Activity activity2;

    public ActivityRelationship() {
    }

    public ActivityRelationship(
           gov.nih.nci.cabig.ccts.domain.bridg.Activity activity,
           gov.nih.nci.cabig.ccts.domain.bridg.Activity activity2) {
           this.activity = activity;
           this.activity2 = activity2;
    }


    /**
     * Gets the activity value for this ActivityRelationship.
     * 
     * @return activity
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Activity getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this ActivityRelationship.
     * 
     * @param activity
     */
    public void setActivity(gov.nih.nci.cabig.ccts.domain.bridg.Activity activity) {
        this.activity = activity;
    }


    /**
     * Gets the activity2 value for this ActivityRelationship.
     * 
     * @return activity2
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.Activity getActivity2() {
        return activity2;
    }


    /**
     * Sets the activity2 value for this ActivityRelationship.
     * 
     * @param activity2
     */
    public void setActivity2(gov.nih.nci.cabig.ccts.domain.bridg.Activity activity2) {
        this.activity2 = activity2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivityRelationship)) return false;
        ActivityRelationship other = (ActivityRelationship) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.activity2==null && other.getActivity2()==null) || 
             (this.activity2!=null &&
              this.activity2.equals(other.getActivity2())));
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
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getActivity2() != null) {
            _hashCode += getActivity2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivityRelationship.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "ActivityRelationship"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Activity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Activity"));
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
