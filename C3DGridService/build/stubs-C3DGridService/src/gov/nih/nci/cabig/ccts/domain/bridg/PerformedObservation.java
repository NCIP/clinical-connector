/**
 * PerformedObservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The completed action of observing, monitoring, measuring or otherwise
 * qualitatively or quantitatively gathering data or information about
 * one or more aspects of a subject's physiologic or psychologic state.
 * 
 * For example, lab test, taking vital signs, physical exam, etc.
 * 
 * NOTE:  The ActivityRelationship allows the model to handle batteries
 * and panels that are composed of component LabTests (for example).
 * Flow cytometry and gene expression analyses are examples that would
 * make use of this association.
 */
public class PerformedObservation  extends gov.nih.nci.cabig.ccts.domain.bridg.PerformedActivity  implements java.io.Serializable {
    /** A coded description of the 3-dimentional spatial orientation of
 * a subject during a particular Activity.
 * 
 * For example, supine, trendelenburg, standing, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD bodyPosition;
    /** Provides additional detail about the means or technique used to
 * ascertain the observation.
 * 
 * For example, blood pressure measurement method could be arterial puncture
 * or sphygmomanometry. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD method;
    /** A free text and coded representation of the PerformedObservation.
 * 
 * NOTE: This is the class-specific analog of SubstanceAdministration.treatment
 * and PerformedAdministrativeActivity. BRIDG THC anticipates renaming
 * this attribute to be more specific for a PerformedObservation.
 * 
 * NOTE: Because this is of datatype CD, it contains both a coded and
 * textual representation of the name of the PerformedObservation. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD name;
    /** Specifies detail about the anatomical site or system that is the
 * focus of the observation. 
 * 
 * For example, gastrointestinal, cardiovascular. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult[] performedClinicalResult;

    public PerformedObservation() {
    }

    public PerformedObservation(
           gov.nih.nci.cabig.ccts.domain.cdt.CD bodyPosition,
           gov.nih.nci.cabig.ccts.domain.cdt.CD method,
           gov.nih.nci.cabig.ccts.domain.cdt.CD name,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult[] performedClinicalResult,
           gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite) {
           this.bodyPosition = bodyPosition;
           this.method = method;
           this.name = name;
           this.targetSite = targetSite;
           this.performedClinicalResult = performedClinicalResult;
    }


    /**
     * Gets the bodyPosition value for this PerformedObservation.
     * 
     * @return bodyPosition A coded description of the 3-dimentional spatial orientation of
 * a subject during a particular Activity.
 * 
 * For example, supine, trendelenburg, standing, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getBodyPosition() {
        return bodyPosition;
    }


    /**
     * Sets the bodyPosition value for this PerformedObservation.
     * 
     * @param bodyPosition A coded description of the 3-dimentional spatial orientation of
 * a subject during a particular Activity.
 * 
 * For example, supine, trendelenburg, standing, etc.
     */
    public void setBodyPosition(gov.nih.nci.cabig.ccts.domain.cdt.CD bodyPosition) {
        this.bodyPosition = bodyPosition;
    }


    /**
     * Gets the method value for this PerformedObservation.
     * 
     * @return method Provides additional detail about the means or technique used to
 * ascertain the observation.
 * 
 * For example, blood pressure measurement method could be arterial puncture
 * or sphygmomanometry.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getMethod() {
        return method;
    }


    /**
     * Sets the method value for this PerformedObservation.
     * 
     * @param method Provides additional detail about the means or technique used to
 * ascertain the observation.
 * 
 * For example, blood pressure measurement method could be arterial puncture
 * or sphygmomanometry.
     */
    public void setMethod(gov.nih.nci.cabig.ccts.domain.cdt.CD method) {
        this.method = method;
    }


    /**
     * Gets the name value for this PerformedObservation.
     * 
     * @return name A free text and coded representation of the PerformedObservation.
 * 
 * NOTE: This is the class-specific analog of SubstanceAdministration.treatment
 * and PerformedAdministrativeActivity. BRIDG THC anticipates renaming
 * this attribute to be more specific for a PerformedObservation.
 * 
 * NOTE: Because this is of datatype CD, it contains both a coded and
 * textual representation of the name of the PerformedObservation.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getName() {
        return name;
    }


    /**
     * Sets the name value for this PerformedObservation.
     * 
     * @param name A free text and coded representation of the PerformedObservation.
 * 
 * NOTE: This is the class-specific analog of SubstanceAdministration.treatment
 * and PerformedAdministrativeActivity. BRIDG THC anticipates renaming
 * this attribute to be more specific for a PerformedObservation.
 * 
 * NOTE: Because this is of datatype CD, it contains both a coded and
 * textual representation of the name of the PerformedObservation.
     */
    public void setName(gov.nih.nci.cabig.ccts.domain.cdt.CD name) {
        this.name = name;
    }


    /**
     * Gets the targetSite value for this PerformedObservation.
     * 
     * @return targetSite Specifies detail about the anatomical site or system that is the
 * focus of the observation. 
 * 
 * For example, gastrointestinal, cardiovascular.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getTargetSite() {
        return targetSite;
    }


    /**
     * Sets the targetSite value for this PerformedObservation.
     * 
     * @param targetSite Specifies detail about the anatomical site or system that is the
 * focus of the observation. 
 * 
 * For example, gastrointestinal, cardiovascular.
     */
    public void setTargetSite(gov.nih.nci.cabig.ccts.domain.cdt.CD targetSite) {
        this.targetSite = targetSite;
    }


    /**
     * Gets the performedClinicalResult value for this PerformedObservation.
     * 
     * @return performedClinicalResult
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult[] getPerformedClinicalResult() {
        return performedClinicalResult;
    }


    /**
     * Sets the performedClinicalResult value for this PerformedObservation.
     * 
     * @param performedClinicalResult
     */
    public void setPerformedClinicalResult(gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult[] performedClinicalResult) {
        this.performedClinicalResult = performedClinicalResult;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult getPerformedClinicalResult(int i) {
        return this.performedClinicalResult[i];
    }

    public void setPerformedClinicalResult(int i, gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult _value) {
        this.performedClinicalResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformedObservation)) return false;
        PerformedObservation other = (PerformedObservation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bodyPosition==null && other.getBodyPosition()==null) || 
             (this.bodyPosition!=null &&
              this.bodyPosition.equals(other.getBodyPosition()))) &&
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.targetSite==null && other.getTargetSite()==null) || 
             (this.targetSite!=null &&
              this.targetSite.equals(other.getTargetSite()))) &&
            ((this.performedClinicalResult==null && other.getPerformedClinicalResult()==null) || 
             (this.performedClinicalResult!=null &&
              java.util.Arrays.equals(this.performedClinicalResult, other.getPerformedClinicalResult())));
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
        if (getBodyPosition() != null) {
            _hashCode += getBodyPosition().hashCode();
        }
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTargetSite() != null) {
            _hashCode += getTargetSite().hashCode();
        }
        if (getPerformedClinicalResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformedClinicalResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformedClinicalResult(), i);
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
        new org.apache.axis.description.TypeDesc(PerformedObservation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedObservation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "bodyPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "method"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetSite");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "targetSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedClinicalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedClinicalResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedClinicalResult"));
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
