
package jp.yahooapis.im.v201809.reportdefinition;

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
@WebServiceClient(name = "ReportDefinitionServiceService", targetNamespace = "http://im.yahooapis.jp/V201809/ReportDefinition", wsdlLocation = "https://sandbox.im.yahooapis.jp/services/V201809/ReportDefinitionService?wsdl")
public class ReportDefinitionServiceService
    extends Service
{

    private final static URL REPORTDEFINITIONSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException REPORTDEFINITIONSERVICESERVICE_EXCEPTION;
    private final static QName REPORTDEFINITIONSERVICESERVICE_QNAME = new QName("http://im.yahooapis.jp/V201809/ReportDefinition", "ReportDefinitionServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sandbox.im.yahooapis.jp/services/V201809/ReportDefinitionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REPORTDEFINITIONSERVICESERVICE_WSDL_LOCATION = url;
        REPORTDEFINITIONSERVICESERVICE_EXCEPTION = e;
    }

    public ReportDefinitionServiceService() {
        super(__getWsdlLocation(), REPORTDEFINITIONSERVICESERVICE_QNAME);
    }

    public ReportDefinitionServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REPORTDEFINITIONSERVICESERVICE_QNAME, features);
    }

    public ReportDefinitionServiceService(URL wsdlLocation) {
        super(wsdlLocation, REPORTDEFINITIONSERVICESERVICE_QNAME);
    }

    public ReportDefinitionServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REPORTDEFINITIONSERVICESERVICE_QNAME, features);
    }

    public ReportDefinitionServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportDefinitionServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReportDefinitionServiceInterface
     */
    @WebEndpoint(name = "ReportDefinitionService")
    public ReportDefinitionServiceInterface getReportDefinitionService() {
        return super.getPort(new QName("http://im.yahooapis.jp/V201809/ReportDefinition", "ReportDefinitionService"), ReportDefinitionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportDefinitionServiceInterface
     */
    @WebEndpoint(name = "ReportDefinitionService")
    public ReportDefinitionServiceInterface getReportDefinitionService(WebServiceFeature... features) {
        return super.getPort(new QName("http://im.yahooapis.jp/V201809/ReportDefinition", "ReportDefinitionService"), ReportDefinitionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REPORTDEFINITIONSERVICESERVICE_EXCEPTION!= null) {
            throw REPORTDEFINITIONSERVICESERVICE_EXCEPTION;
        }
        return REPORTDEFINITIONSERVICESERVICE_WSDL_LOCATION;
    }

}
