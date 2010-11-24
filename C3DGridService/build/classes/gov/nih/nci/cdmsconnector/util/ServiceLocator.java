package gov.nih.nci.cdmsconnector.util;

import gov.nih.nci.cdmsconnector.util.ServiceLocatorException;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.transaction.UserTransaction;





/**
 * This class is an implementation of the Service Locator pattern. It is 
 * used to looukup resources such as EJBHomes, JMS Destinations, etc. 
 * This implementation uses the "singleton" strategy and also the "caching"
 * strategy.
 * This implementation is intended to be used on the web tier and 
 * not on the ejb tier.
 */
public class ServiceLocator {

    private InitialContext ic;
    private Map cache; //used to hold references to EJBHomes/JMS Resources for re-use

    private static ServiceLocator me;
    public static final String C3D_DATA_SOURCE = "java:comp/env/c3d_DS";
    public static final String USER_TRANSACTION = "java:comp/UserTransaction";
    static {
      try {
        me = new ServiceLocator();
      } catch(ServiceLocatorException se) {
        System.err.println(se);
        se.printStackTrace(System.err);
      }
    }

    private ServiceLocator() throws ServiceLocatorException  {
      try {
        // Hashtable env = new Hashtable();
  //  env.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
  //  env.put(Context.PROVIDER_URL,"localhost:1099");
  //  env.put("java.naming.factory.url.pkgs","org.jboss.naming:org.jnp.interfaces");
       // ic = new InitialContext(env);
        ic = new InitialContext();
        cache = Collections.synchronizedMap(new HashMap());
      } catch (NamingException ne) {
            throw new ServiceLocatorException(ne);
      } catch (Exception e) {
            throw new ServiceLocatorException(e);
       }
    }

    static public ServiceLocator getInstance() {
      return me;
    }

   /**
     * This method obtains the datasource itself for a caller
     * @return the DataSource corresponding to the name parameter
     */
    public DataSource getDataSource(String dataSourceName) throws ServiceLocatorException {
      DataSource dataSource = null;
      try {
        if (cache.containsKey(dataSourceName)) {
           dataSource = (DataSource) cache.get(dataSourceName);
        } else {
            dataSource = (DataSource)ic.lookup(dataSourceName);
            cache.put(dataSourceName, dataSource );
        }
      } catch (NamingException ne) {
         throw new ServiceLocatorException(ne);
      } catch (Exception e) {
            throw new ServiceLocatorException(e);
      }
      return dataSource;
    }
    public UserTransaction getUserTransaction() throws ServiceLocatorException
	   { 
	      UserTransaction ut = null;
	     try{
	          if(cache.containsKey(USER_TRANSACTION))
	          {
	            ut = (UserTransaction)cache.get(USER_TRANSACTION);
	          }else
	          {
	            ut = (UserTransaction)ic.lookup("java:comp/UserTransaction");
	              if(ut==null)
	              {
	                System.out.println("Could not find");
	              }else
	              {
	                cache.put(USER_TRANSACTION, ut);
	              }
	          }
	             
	     } catch (NamingException ne) {
	            System.out.println("Message Naming Exception:"+ne.getMessage());
	            throw new ServiceLocatorException(ne);
	       } catch (Exception e) {
	            System.out.println("Message gen Exception:"+e.getMessage()+e.getLocalizedMessage());
	            throw new ServiceLocatorException(e);
	       }
	       return ut;
	   }

    public class Services {
    final public static int REG_ADMIN  = 0;
  }   

}
