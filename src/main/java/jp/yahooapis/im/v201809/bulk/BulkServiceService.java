
package jp.yahooapis.im.v201809.bulk;

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
@WebServiceClient(name = "BulkServiceService", targetNamespace = "http://im.yahooapis.jp/V201809/Bulk", wsdlLocation = "https://sandbox.im.yahooapis.jp/services/V201809/BulkService?wsdl")
public class BulkServiceService
    extends Service
{

    private final static URL BULKSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException BULKSERVICESERVICE_EXCEPTION;
    private final static QName BULKSERVICESERVICE_QNAME = new QName("http://im.yahooapis.jp/V201809/Bulk", "BulkServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sandbox.im.yahooapis.jp/services/V201809/BulkService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BULKSERVICESERVICE_WSDL_LOCATION = url;
        BULKSERVICESERVICE_EXCEPTION = e;
    }

    public BulkServiceService() {
        super(__getWsdlLocation(), BULKSERVICESERVICE_QNAME);
    }

    public BulkServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BULKSERVICESERVICE_QNAME, features);
    }

    public BulkServiceService(URL wsdlLocation) {
        super(wsdlLocation, BULKSERVICESERVICE_QNAME);
    }

    public BulkServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BULKSERVICESERVICE_QNAME, features);
    }

    public BulkServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BulkServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BulkServiceInterface
     */
    @WebEndpoint(name = "BulkService")
    public BulkServiceInterface getBulkService() {
        return super.getPort(new QName("http://im.yahooapis.jp/V201809/Bulk", "BulkService"), BulkServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BulkServiceInterface
     */
    @WebEndpoint(name = "BulkService")
    public BulkServiceInterface getBulkService(WebServiceFeature... features) {
        return super.getPort(new QName("http://im.yahooapis.jp/V201809/Bulk", "BulkService"), BulkServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BULKSERVICESERVICE_EXCEPTION!= null) {
            throw BULKSERVICESERVICE_EXCEPTION;
        }
        return BULKSERVICESERVICE_WSDL_LOCATION;
    }

}
