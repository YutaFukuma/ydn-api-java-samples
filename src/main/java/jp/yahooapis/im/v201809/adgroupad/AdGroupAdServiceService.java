
package jp.yahooapis.im.v201809.adgroupad;

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
@WebServiceClient(name = "AdGroupAdServiceService", targetNamespace = "http://im.yahooapis.jp/V201809/AdGroupAd", wsdlLocation = "https://sandbox.im.yahooapis.jp/services/V201809/AdGroupAdService?wsdl")
public class AdGroupAdServiceService
    extends Service
{

    private final static URL ADGROUPADSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException ADGROUPADSERVICESERVICE_EXCEPTION;
    private final static QName ADGROUPADSERVICESERVICE_QNAME = new QName("http://im.yahooapis.jp/V201809/AdGroupAd", "AdGroupAdServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sandbox.im.yahooapis.jp/services/V201809/AdGroupAdService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADGROUPADSERVICESERVICE_WSDL_LOCATION = url;
        ADGROUPADSERVICESERVICE_EXCEPTION = e;
    }

    public AdGroupAdServiceService() {
        super(__getWsdlLocation(), ADGROUPADSERVICESERVICE_QNAME);
    }

    public AdGroupAdServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADGROUPADSERVICESERVICE_QNAME, features);
    }

    public AdGroupAdServiceService(URL wsdlLocation) {
        super(wsdlLocation, ADGROUPADSERVICESERVICE_QNAME);
    }

    public AdGroupAdServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADGROUPADSERVICESERVICE_QNAME, features);
    }

    public AdGroupAdServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdGroupAdServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdGroupAdServiceInterface
     */
    @WebEndpoint(name = "AdGroupAdService")
    public AdGroupAdServiceInterface getAdGroupAdService() {
        return super.getPort(new QName("http://im.yahooapis.jp/V201809/AdGroupAd", "AdGroupAdService"), AdGroupAdServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdGroupAdServiceInterface
     */
    @WebEndpoint(name = "AdGroupAdService")
    public AdGroupAdServiceInterface getAdGroupAdService(WebServiceFeature... features) {
        return super.getPort(new QName("http://im.yahooapis.jp/V201809/AdGroupAd", "AdGroupAdService"), AdGroupAdServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADGROUPADSERVICESERVICE_EXCEPTION!= null) {
            throw ADGROUPADSERVICESERVICE_EXCEPTION;
        }
        return ADGROUPADSERVICESERVICE_WSDL_LOCATION;
    }

}
