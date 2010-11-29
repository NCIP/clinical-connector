/**
 * ColValign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package _21090.org.iso;

public class ColValign implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ColValign(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _top = new org.apache.axis.types.NMToken("top");
    public static final org.apache.axis.types.NMToken _middle = new org.apache.axis.types.NMToken("middle");
    public static final org.apache.axis.types.NMToken _bottom = new org.apache.axis.types.NMToken("bottom");
    public static final org.apache.axis.types.NMToken _baseline = new org.apache.axis.types.NMToken("baseline");
    public static final ColValign top = new ColValign(_top);
    public static final ColValign middle = new ColValign(_middle);
    public static final ColValign bottom = new ColValign(_bottom);
    public static final ColValign baseline = new ColValign(_baseline);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ColValign fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ColValign enumeration = (ColValign)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ColValign fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ColValign.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iso.org:21090", ">>col>valign"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}