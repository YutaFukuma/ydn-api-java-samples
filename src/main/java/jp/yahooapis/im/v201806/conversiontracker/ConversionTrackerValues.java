
package jp.yahooapis.im.v201806.conversiontracker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import jp.yahooapis.im.v201806.ReturnValue;


/**
 * <p>Java class for ConversionTrackerValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionTrackerValues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://im.yahooapis.jp/V201806}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="conversionTracker" type="{http://im.yahooapis.jp/V201806/ConversionTracker}ConversionTracker" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionTrackerValues", propOrder = {
    "conversionTracker"
})
public class ConversionTrackerValues
    extends ReturnValue
{

    protected ConversionTracker conversionTracker;

    /**
     * Gets the value of the conversionTracker property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionTracker }
     *     
     */
    public ConversionTracker getConversionTracker() {
        return conversionTracker;
    }

    /**
     * Sets the value of the conversionTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionTracker }
     *     
     */
    public void setConversionTracker(ConversionTracker value) {
        this.conversionTracker = value;
    }

}
