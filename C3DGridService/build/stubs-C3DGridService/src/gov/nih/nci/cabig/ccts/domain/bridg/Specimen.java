/**
 * Specimen.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * The individual biospecimen collected during the acquisition activity.
 * 
 * For example, a serum sample from blood.
 */
public class Specimen  implements java.io.Serializable {
    /** An identifier assigned by a receiving lab to specimens that are
 * received together as a set.
 * 
 * NOTE: Accession concept definition - An act of assigning identifier
 * for the purpose of receiving specimen(s), tracking and recording the
 * acquisition.  For central labs -- the purpose accession number is
 * generally the kit identifier. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST accessionNumber;
    /** A discreet list of values describing the condition of the specimen
 * at time of receipt at the lab. 
 * 
 * For example, Hemolyzed, Icteric, Lipemic, etc. */
    private gov.nih.nci.cabig.ccts.domain.cdt.ST condition;
    /** The unique identifier for the Specimen. */
    private gov.nih.nci.cabig.ccts.domain.cdt.II identifier;
    /** A coded value specifying the particular kind of specimen materials.
 * 
 * For example, Serum (SER), Plasma (PLAS), etc. 
 * 
 * NOTE: Review HL7 LOV for sample type codes. 
 * 
 * NOTE: Specimen = Sample
 * 
 * NOTE:  Specimen Material Code List ID Definition: The unique identifier
 * of the code system used to define the sample type. For example, if
 * the Specimen Material code is used from EVS, this would be the unique
 * identifier of EVS. */
    private gov.nih.nci.cabig.ccts.domain.cdt.CD type;
    private gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection performedSpecimenCollection;

    public Specimen() {
    }

    public Specimen(
           gov.nih.nci.cabig.ccts.domain.cdt.ST accessionNumber,
           gov.nih.nci.cabig.ccts.domain.cdt.ST condition,
           gov.nih.nci.cabig.ccts.domain.cdt.II identifier,
           gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection performedSpecimenCollection,
           gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
           this.accessionNumber = accessionNumber;
           this.condition = condition;
           this.identifier = identifier;
           this.type = type;
           this.performedSpecimenCollection = performedSpecimenCollection;
    }


    /**
     * Gets the accessionNumber value for this Specimen.
     * 
     * @return accessionNumber An identifier assigned by a receiving lab to specimens that are
 * received together as a set.
 * 
 * NOTE: Accession concept definition - An act of assigning identifier
 * for the purpose of receiving specimen(s), tracking and recording the
 * acquisition.  For central labs -- the purpose accession number is
 * generally the kit identifier.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getAccessionNumber() {
        return accessionNumber;
    }


    /**
     * Sets the accessionNumber value for this Specimen.
     * 
     * @param accessionNumber An identifier assigned by a receiving lab to specimens that are
 * received together as a set.
 * 
 * NOTE: Accession concept definition - An act of assigning identifier
 * for the purpose of receiving specimen(s), tracking and recording the
 * acquisition.  For central labs -- the purpose accession number is
 * generally the kit identifier.
     */
    public void setAccessionNumber(gov.nih.nci.cabig.ccts.domain.cdt.ST accessionNumber) {
        this.accessionNumber = accessionNumber;
    }


    /**
     * Gets the condition value for this Specimen.
     * 
     * @return condition A discreet list of values describing the condition of the specimen
 * at time of receipt at the lab. 
 * 
 * For example, Hemolyzed, Icteric, Lipemic, etc.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.ST getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this Specimen.
     * 
     * @param condition A discreet list of values describing the condition of the specimen
 * at time of receipt at the lab. 
 * 
 * For example, Hemolyzed, Icteric, Lipemic, etc.
     */
    public void setCondition(gov.nih.nci.cabig.ccts.domain.cdt.ST condition) {
        this.condition = condition;
    }


    /**
     * Gets the identifier value for this Specimen.
     * 
     * @return identifier The unique identifier for the Specimen.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.II getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Specimen.
     * 
     * @param identifier The unique identifier for the Specimen.
     */
    public void setIdentifier(gov.nih.nci.cabig.ccts.domain.cdt.II identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the type value for this Specimen.
     * 
     * @return type A coded value specifying the particular kind of specimen materials.
 * 
 * For example, Serum (SER), Plasma (PLAS), etc. 
 * 
 * NOTE: Review HL7 LOV for sample type codes. 
 * 
 * NOTE: Specimen = Sample
 * 
 * NOTE:  Specimen Material Code List ID Definition: The unique identifier
 * of the code system used to define the sample type. For example, if
 * the Specimen Material code is used from EVS, this would be the unique
 * identifier of EVS.
     */
    public gov.nih.nci.cabig.ccts.domain.cdt.CD getType() {
        return type;
    }


    /**
     * Sets the type value for this Specimen.
     * 
     * @param type A coded value specifying the particular kind of specimen materials.
 * 
 * For example, Serum (SER), Plasma (PLAS), etc. 
 * 
 * NOTE: Review HL7 LOV for sample type codes. 
 * 
 * NOTE: Specimen = Sample
 * 
 * NOTE:  Specimen Material Code List ID Definition: The unique identifier
 * of the code system used to define the sample type. For example, if
 * the Specimen Material code is used from EVS, this would be the unique
 * identifier of EVS.
     */
    public void setType(gov.nih.nci.cabig.ccts.domain.cdt.CD type) {
        this.type = type;
    }


    /**
     * Gets the performedSpecimenCollection value for this Specimen.
     * 
     * @return performedSpecimenCollection
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection getPerformedSpecimenCollection() {
        return performedSpecimenCollection;
    }


    /**
     * Sets the performedSpecimenCollection value for this Specimen.
     * 
     * @param performedSpecimenCollection
     */
    public void setPerformedSpecimenCollection(gov.nih.nci.cabig.ccts.domain.bridg.PerformedSpecimenCollection performedSpecimenCollection) {
        this.performedSpecimenCollection = performedSpecimenCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Specimen)) return false;
        Specimen other = (Specimen) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessionNumber==null && other.getAccessionNumber()==null) || 
             (this.accessionNumber!=null &&
              this.accessionNumber.equals(other.getAccessionNumber()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.performedSpecimenCollection==null && other.getPerformedSpecimenCollection()==null) || 
             (this.performedSpecimenCollection!=null &&
              this.performedSpecimenCollection.equals(other.getPerformedSpecimenCollection())));
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
        if (getAccessionNumber() != null) {
            _hashCode += getAccessionNumber().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPerformedSpecimenCollection() != null) {
            _hashCode += getPerformedSpecimenCollection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Specimen.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "Specimen"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "accessionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "ST"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "II"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.cdt", "CD"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedSpecimenCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSpecimenCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "PerformedSpecimenCollection"));
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
