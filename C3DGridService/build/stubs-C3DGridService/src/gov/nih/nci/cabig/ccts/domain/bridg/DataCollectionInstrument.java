/**
 * DataCollectionInstrument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.cabig.ccts.domain.bridg;


/**
 * This class is used to hold context data related to the study data
 * collection instrument "DCI" (the top most level of data collection
 * in C3D)
 */
public class DataCollectionInstrument  implements java.io.Serializable {
    private java.util.Date date;
    private int id;
    private java.lang.String name;
    private gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule[] dataCollectionModule;

    public DataCollectionInstrument() {
    }

    public DataCollectionInstrument(
           gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule[] dataCollectionModule,
           java.util.Date date,
           int id,
           java.lang.String name) {
           this.date = date;
           this.id = id;
           this.name = name;
           this.dataCollectionModule = dataCollectionModule;
    }


    /**
     * Gets the date value for this DataCollectionInstrument.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this DataCollectionInstrument.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the id value for this DataCollectionInstrument.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DataCollectionInstrument.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this DataCollectionInstrument.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DataCollectionInstrument.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dataCollectionModule value for this DataCollectionInstrument.
     * 
     * @return dataCollectionModule
     */
    public gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule[] getDataCollectionModule() {
        return dataCollectionModule;
    }


    /**
     * Sets the dataCollectionModule value for this DataCollectionInstrument.
     * 
     * @param dataCollectionModule
     */
    public void setDataCollectionModule(gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule[] dataCollectionModule) {
        this.dataCollectionModule = dataCollectionModule;
    }

    public gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule getDataCollectionModule(int i) {
        return this.dataCollectionModule[i];
    }

    public void setDataCollectionModule(int i, gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule _value) {
        this.dataCollectionModule[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataCollectionInstrument)) return false;
        DataCollectionInstrument other = (DataCollectionInstrument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.dataCollectionModule==null && other.getDataCollectionModule()==null) || 
             (this.dataCollectionModule!=null &&
              java.util.Arrays.equals(this.dataCollectionModule, other.getDataCollectionModule())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDataCollectionModule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataCollectionModule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataCollectionModule(), i);
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
        new org.apache.axis.description.TypeDesc(DataCollectionInstrument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DataCollectionInstrument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("dataCollectionModule");
        elemField.setXmlName(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DataCollectionModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("gme://ccts.cabig/1.0/gov.nih.nci.cabig.ccts.domain.bridg", "DataCollectionModule"));
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
