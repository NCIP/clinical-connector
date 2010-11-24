/**
 * ClinicalConnectorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Apr 28, 2006 (12:42:00 EDT) WSDL2Java emitter.
 */

package gov.nih.nci.clinicalconnector.stubs.service;

public class ClinicalConnectorServiceLocator extends org.apache.axis.client.Service implements gov.nih.nci.clinicalconnector.stubs.service.ClinicalConnectorService {

    public ClinicalConnectorServiceLocator() {
    }


    public ClinicalConnectorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClinicalConnectorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClinicalConnectorPortTypePort
    private java.lang.String ClinicalConnectorPortTypePort_address = "http://localhost:8080/wsrf/services/";

    public java.lang.String getClinicalConnectorPortTypePortAddress() {
        return ClinicalConnectorPortTypePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClinicalConnectorPortTypePortWSDDServiceName = "ClinicalConnectorPortTypePort";

    public java.lang.String getClinicalConnectorPortTypePortWSDDServiceName() {
        return ClinicalConnectorPortTypePortWSDDServiceName;
    }

    public void setClinicalConnectorPortTypePortWSDDServiceName(java.lang.String name) {
        ClinicalConnectorPortTypePortWSDDServiceName = name;
    }

    public gov.nih.nci.clinicalconnector.stubs.ClinicalConnectorPortType getClinicalConnectorPortTypePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClinicalConnectorPortTypePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClinicalConnectorPortTypePort(endpoint);
    }

    public gov.nih.nci.clinicalconnector.stubs.ClinicalConnectorPortType getClinicalConnectorPortTypePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gov.nih.nci.clinicalconnector.stubs.bindings.ClinicalConnectorPortTypeSOAPBindingStub _stub = new gov.nih.nci.clinicalconnector.stubs.bindings.ClinicalConnectorPortTypeSOAPBindingStub(portAddress, this);
            _stub.setPortName(getClinicalConnectorPortTypePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClinicalConnectorPortTypePortEndpointAddress(java.lang.String address) {
        ClinicalConnectorPortTypePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (gov.nih.nci.clinicalconnector.stubs.ClinicalConnectorPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                gov.nih.nci.clinicalconnector.stubs.bindings.ClinicalConnectorPortTypeSOAPBindingStub _stub = new gov.nih.nci.clinicalconnector.stubs.bindings.ClinicalConnectorPortTypeSOAPBindingStub(new java.net.URL(ClinicalConnectorPortTypePort_address), this);
                _stub.setPortName(getClinicalConnectorPortTypePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ClinicalConnectorPortTypePort".equals(inputPortName)) {
            return getClinicalConnectorPortTypePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://gov.nci.nih.clinicalconnector/ClinicalConnector/service", "ClinicalConnectorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://gov.nci.nih.clinicalconnector/ClinicalConnector/service", "ClinicalConnectorPortTypePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("ClinicalConnectorPortTypePort".equals(portName)) {
            setClinicalConnectorPortTypePortEndpointAddress(address);
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
