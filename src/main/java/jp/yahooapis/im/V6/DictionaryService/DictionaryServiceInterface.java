
package jp.yahooapis.im.V6.DictionaryService;

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
@WebService(name = "DictionaryServiceInterface", targetNamespace = "http://im.yahooapis.jp/V6")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DictionaryServiceInterface {


    /**
     * 
     * @param selector
     * @param rval
     * @param error
     * @throws ApiException
     */
    @WebMethod
    @RequestWrapper(localName = "getDisapprovalReason", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetDisapprovalReason")
    @ResponseWrapper(localName = "getDisapprovalReasonResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetDisapprovalReasonResponse")
    public void getDisapprovalReason(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V6")
        DisapprovalReasonSelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<DisapprovalReasonPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
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
    @RequestWrapper(localName = "getGeographicLocation", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetGeographicLocation")
    @ResponseWrapper(localName = "getGeographicLocationResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetGeographicLocationResponse")
    public void getGeographicLocation(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V6")
        GeographicLocationSelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<GeographicLocationPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
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
    @RequestWrapper(localName = "getInterestCategory", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetInterestCategory")
    @ResponseWrapper(localName = "getInterestCategoryResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetInterestCategoryResponse")
    public void getInterestCategory(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V6")
        CategorySelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<CategoryPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
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
    @RequestWrapper(localName = "getSiteCategory", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetSiteCategory")
    @ResponseWrapper(localName = "getSiteCategoryResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetSiteCategoryResponse")
    public void getSiteCategory(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V6")
        CategorySelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<CategoryPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
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
    @RequestWrapper(localName = "getColorSet", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetColorSet")
    @ResponseWrapper(localName = "getColorSetResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetColorSetResponse")
    public void getColorSet(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V6")
        ColorSetSelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<ColorSetPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
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
    @RequestWrapper(localName = "getOsVersion", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetOsVersion")
    @ResponseWrapper(localName = "getOsVersionResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetOsVersionResponse")
    public void getOsVersion(
        @WebParam(name = "selector", targetNamespace = "http://im.yahooapis.jp/V6")
        OsVersionSelector selector,
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<OsVersionPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<List<Error>> error)
        throws ApiException
    ;

    /**
     * 
     * @param rval
     * @param error
     * @throws ApiException
     */
    @WebMethod
    @RequestWrapper(localName = "getMediaAdFormat", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetMediaAdFormat")
    @ResponseWrapper(localName = "getMediaAdFormatResponse", targetNamespace = "http://im.yahooapis.jp/V6", className = "jp.yahooapis.im.V6.DictionaryService.GetMediaAdFormatResponse")
    public void getMediaAdFormat(
        @WebParam(name = "rval", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<MediaAdFormatPage> rval,
        @WebParam(name = "error", targetNamespace = "http://im.yahooapis.jp/V6", mode = WebParam.Mode.OUT)
        Holder<List<Error>> error)
        throws ApiException
    ;

}
