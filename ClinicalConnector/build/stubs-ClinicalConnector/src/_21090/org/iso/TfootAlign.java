/**
 * TfootAlign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class TfootAlign implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TfootAlign(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("left");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("center");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("right");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("justify");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("char");
    public static final TfootAlign value1 = new TfootAlign(_value1);
    public static final TfootAlign value2 = new TfootAlign(_value2);
    public static final TfootAlign value3 = new TfootAlign(_value3);
    public static final TfootAlign value4 = new TfootAlign(_value4);
    public static final TfootAlign value5 = new TfootAlign(_value5);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static TfootAlign fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        TfootAlign enumeration = (TfootAlign)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TfootAlign fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NMToken(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TfootAlign.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", ">>tfoot>align"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
