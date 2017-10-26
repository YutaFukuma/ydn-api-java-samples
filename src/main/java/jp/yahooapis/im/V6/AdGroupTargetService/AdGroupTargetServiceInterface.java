
package jp.yahooapis.im.V6.AdGroupTargetService;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdGroupTargetServiceInterface", targetNamespace = "http://im.yahooapis.jp/V6")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupTargetServiceInterface {


    /**
     * 
     * @param selector
     * @param rval
     * @param error
     * @throws ApiException
     */
    @WebMethod
    @RequestWrapper(localName = "get", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.AdGroupTargetService.Get")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.AdGroupTargetService.GetResponse")
    public void get(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V6")
        AdGroupTargetSelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<AdGroupTargetPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
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
    @RequestWrapper(localName = "mutate", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.AdGroupTargetService.Mutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.AdGroupTargetService.MutateResponse")
    public void mutate(
        @WebParam(name = "operations", targetNamespace = "http://im.yahooapis.jp/V6")
        AdGroupTargetMutateOperation operations,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<AdGroupTargetReturnValue> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
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
    @RequestWrapper(localName = "replace", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.AdGroupTargetService.Replace")
    @ResponseWrapper(localName = "replaceResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.AdGroupTargetService.ReplaceResponse")
    public void replace(
        @WebParam(name = "operations", targetNamespace = "http://im.yahooapis.jp/V6")
        AdGroupTargetOperation operations,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<AdGroupTargetReturnValue> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<List<Error>> error)
        throws ApiException
    ;

}
