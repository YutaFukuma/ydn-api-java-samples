
package jp.yahooapis.im.v201809.report;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import jp.yahooapis.im.v201809.Error;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReportServiceInterface", targetNamespace = "http://im.yahooapis.jp/V201809/Report")
@XmlSeeAlso({
    jp.yahooapis.im.v201809.ObjectFactory.class,
    jp.yahooapis.im.v201809.report.ObjectFactory.class
})
public interface ReportServiceInterface {


    /**
     * 
     * @param selector
     * @param rval
     * @param error
     * @throws ApiException
     */
    @WebMethod
    @RequestWrapper(localName = "get", targetNamespace = "http://im.yahooapis.jp/V201809/Report", className = "jp.yahooapis.im.v201809.report.Get")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "http://im.yahooapis.jp/V201809/Report", className = "jp.yahooapis.im.v201809.report.GetResponse")
    public void get(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V201809/Report")
        ReportSelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V201809/Report", mode = WebParam.Mode.OUT)
        Holder<ReportPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V201809/Report", mode = WebParam.Mode.OUT)
        Holder<List<Error>> error)
        throws ApiException
    ;

    /**
     * 
     * @param selector
     * @param rval
     * @param error
     * @throws ApiException
     */
    @WebMethod
    @RequestWrapper(localName = "getClosedDate", targetNamespace = "http://im.yahooapis.jp/V201809/Report", className = "jp.yahooapis.im.v201809.report.GetClosedDate")
    @ResponseWrapper(localName = "getClosedDateResponse", targetNamespace = "http://im.yahooapis.jp/V201809/Report", className = "jp.yahooapis.im.v201809.report.GetClosedDateResponse")
    public void getClosedDate(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V201809/Report")
        ReportClosedDateSelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V201809/Report", mode = WebParam.Mode.OUT)
        Holder<ReportClosedDateValue> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V201809/Report", mode = WebParam.Mode.OUT)
        Holder<List<Error>> error)
        throws ApiException
    ;

    /**
     * 
     * @param operations
     * @param rval
     * @param error
     * @throws ApiException
     */
    @WebMethod
    @RequestWrapper(localName = "mutate", targetNamespace = "http://im.yahooapis.jp/V201809/Report", className = "jp.yahooapis.im.v201809.report.Mutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "http://im.yahooapis.jp/V201809/Report", className = "jp.yahooapis.im.v201809.report.MutateResponse")
    public void mutate(
        @WebParam(name = "operations", targetNamespace = "http://im.yahooapis.jp/V201809/Report")
        ReportJobOperation operations,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V201809/Report", mode = WebParam.Mode.OUT)
        Holder<ReportReturnValue> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V201809/Report", mode = WebParam.Mode.OUT)
        Holder<List<Error>> error)
        throws ApiException
    ;

}
