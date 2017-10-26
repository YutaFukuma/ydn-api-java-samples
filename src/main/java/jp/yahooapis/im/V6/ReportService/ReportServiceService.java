
package jp.yahooapis.im.V6.ReportService;

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
@WebServiceClient(name = "ReportServiceService", targetNamespace = "http://im.yahooapis.jp/V6", wsdlLocation = "https://sandbox.im.yahooapis.jp/services/V6.1/ReportService?wsdl")
public class ReportServiceService
    extends Service
{

    private final static URL REPORTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException REPORTSERVICESERVICE_EXCEPTION;
    private final static QName REPORTSERVICESERVICE_QNAME = new QName("http://im.yahooapis.jp/V6", "ReportServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sandbox.im.yahooapis.jp/services/V6.1/ReportService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REPORTSERVICESERVICE_WSDL_LOCATION = url;
        REPORTSERVICESERVICE_EXCEPTION = e;
    }

    public ReportServiceService() {
        super(__getWsdlLocation(), REPORTSERVICESERVICE_QNAME);
    }

    public ReportServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REPORTSERVICESERVICE_QNAME, features);
    }

    public ReportServiceService(URL wsdlLocation) {
        super(wsdlLocation, REPORTSERVICESERVICE_QNAME);
    }

    public ReportServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REPORTSERVICESERVICE_QNAME, features);
    }

    public ReportServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReportServiceInterface
     */
    @WebEndpoint(name = "ReportService")
    public ReportServiceInterface getReportService() {
        return super.getPort(new QName("http://im.yahooapis.jp/V6", "ReportService"), ReportServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportServiceInterface
     */
    @WebEndpoint(name = "ReportService")
    public ReportServiceInterface getReportService(WebServiceFeature... features) {
        return super.getPort(new QName("http://im.yahooapis.jp/V6", "ReportService"), ReportServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REPORTSERVICESERVICE_EXCEPTION!= null) {
            throw REPORTSERVICESERVICE_EXCEPTION;
        }
        return REPORTSERVICESERVICE_WSDL_LOCATION;
    }

}
