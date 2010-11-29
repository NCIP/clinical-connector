package gov.nih.nci.cdmsconnector.c3d.service;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse;
import org.oasis.wsrf.properties.GetMultipleResourceProperties_Element;
import org.oasis.wsrf.properties.GetResourcePropertyResponse;
import org.oasis.wsrf.properties.QueryResourcePropertiesResponse;
import org.oasis.wsrf.properties.QueryResourceProperties_Element;

import gov.nih.nci.cabig.ccts.domain.Registration;
import gov.nih.nci.ccts.grid.common.RegistrationConsumerI;
import gov.nih.nci.ccts.grid.stubs.types.InvalidRegistrationException;
import gov.nih.nci.ccts.grid.stubs.types.RegistrationConsumptionException;

public abstract class AbstractRegistrationConsumerImpl implements RegistrationConsumerI{

	public void commit(Registration registration) throws RemoteException,
			InvalidRegistrationException {
		// TODO Auto-generated method stub
		
	}

	public GetMultipleResourcePropertiesResponse getMultipleResourceProperties(
			GetMultipleResourceProperties_Element params)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public GetResourcePropertyResponse getResourceProperty(QName arg0)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public QueryResourcePropertiesResponse queryResourceProperties(
			QueryResourceProperties_Element arg0) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract Registration register(Registration registration)
			throws RemoteException, InvalidRegistrationException,
			RegistrationConsumptionException ;

	public void rollback(Registration registration) throws RemoteException,
			InvalidRegistrationException {
		// TODO Auto-generated method stub
		
	}

}