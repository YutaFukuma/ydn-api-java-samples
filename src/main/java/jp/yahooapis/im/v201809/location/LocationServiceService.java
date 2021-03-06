
package jp.yahooapis.im.v201809.location;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LocationServiceService", targetNamespace = "http://im.yahooapis.jp/V201809/Location", wsdlLocation = "https://sandbox.im.yahooapis.jp/services/V201809/LocationService?wsdl")
public class LocationServiceService
    extends Service
{

    private final static URL LOCATIONSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException LOCATIONSERVICESERVICE_EXCEPTION;
    private final static QName LOCATIONSERVICESERVICE_QNAME = new QName("http://im.yahooapis.jp/V201809/Location", "LocationServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sandbox.im.yahooapis.jp/services/V201809/LocationService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOCATIONSERVICESERVICE_WSDL_LOCATION = url;
        LOCATIONSERVICESERVICE_EXCEPTION = e;
    }

    public LocationServiceService() {
        super(__getWsdlLocation(), LOCATIONSERVICESERVICE_QNAME);
    }

    public LocationServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOCATIONSERVICESERVICE_QNAME, features);
    }

    public LocationServiceService(URL wsdlLocation) {
        super(wsdlLocation, LOCATIONSERVICESERVICE_QNAME);
    }

    public LocationServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOCATIONSERVICESERVICE_QNAME, features);
    }

    public LocationServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LocationServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LocationServiceInterface
     */
    @WebEndpoint(name = "LocationService")
    public LocationServiceInterface getLocationService() {
        return super.getPort(new QName("http://im.yahooapis.jp/V201809/Location", "LocationService"), LocationServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocationServiceInterface
     */
    @WebEndpoint(name = "LocationService")
    public LocationServiceInterface getLocationService(WebServiceFeature... features) {
        return super.getPort(new QName("http://im.yahooapis.jp/V201809/Location", "LocationService"), LocationServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOCATIONSERVICESERVICE_EXCEPTION!= null) {
            throw LOCATIONSERVICESERVICE_EXCEPTION;
        }
        return LOCATIONSERVICESERVICE_WSDL_LOCATION;
    }

}
