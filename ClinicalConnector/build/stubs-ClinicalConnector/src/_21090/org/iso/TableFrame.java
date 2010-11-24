/**
 * TableFrame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class TableFrame implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TableFrame(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _value1 = new org.apache.axis.types.NMToken("void");
    public static final org.apache.axis.types.NMToken _value2 = new org.apache.axis.types.NMToken("above");
    public static final org.apache.axis.types.NMToken _value3 = new org.apache.axis.types.NMToken("below");
    public static final org.apache.axis.types.NMToken _value4 = new org.apache.axis.types.NMToken("hsides");
    public static final org.apache.axis.types.NMToken _value5 = new org.apache.axis.types.NMToken("lhs");
    public static final org.apache.axis.types.NMToken _value6 = new org.apache.axis.types.NMToken("rhs");
    public static final org.apache.axis.types.NMToken _value7 = new org.apache.axis.types.NMToken("vsides");
    public static final org.apache.axis.types.NMToken _value8 = new org.apache.axis.types.NMToken("box");
    public static final org.apache.axis.types.NMToken _value9 = new org.apache.axis.types.NMToken("border");
    public static final TableFrame value1 = new TableFrame(_value1);
    public static final TableFrame value2 = new TableFrame(_value2);
    public static final TableFrame value3 = new TableFrame(_value3);
    public static final TableFrame value4 = new TableFrame(_value4);
    public static final TableFrame value5 = new TableFrame(_value5);
    public static final TableFrame value6 = new TableFrame(_value6);
    public static final TableFrame value7 = new TableFrame(_value7);
    public static final TableFrame value8 = new TableFrame(_value8);
    public static final TableFrame value9 = new TableFrame(_value9);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static TableFrame fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        TableFrame enumeration = (TableFrame)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TableFrame fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TableFrame.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", ">>table>frame"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
