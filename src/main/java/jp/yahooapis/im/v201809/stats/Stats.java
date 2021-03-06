
package jp.yahooapis.im.v201809.stats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clickRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalClickCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clickCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="avgClickCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="conversions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cpa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conversionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valuePerConversions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="allConversionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="allCpa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allConversionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valuePerAllConversions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avgDeliverRank" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalVimps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vImps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inViewClickCnt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inViewRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="inViewClickRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="autoVideoPlays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clickVideoPlays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoViewedRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paidVideoViews" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paidVideoViewRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="averageCpv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="videoPlays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoViews" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoViewsTo25" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoViewsTo50" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoViewsTo75" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoViewsTo95" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoViewsTo100" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoViewsTo3Sec" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="averageRateVideoViewed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="averageDurationVideoViewed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stats", propOrder = {
    "imps",
    "clickRate",
    "totalClickCost",
    "clickCnt",
    "avgClickCost",
    "conversions",
    "conversionRate",
    "cpa",
    "conversionValue",
    "valuePerConversions",
    "allConversions",
    "allConversionRate",
    "allCpa",
    "allConversionValue",
    "valuePerAllConversions",
    "avgDeliverRank",
    "totalVimps",
    "vImps",
    "inViewClickCnt",
    "inViewRate",
    "inViewClickRate",
    "autoVideoPlays",
    "clickVideoPlays",
    "videoViewedRate",
    "paidVideoViews",
    "paidVideoViewRate",
    "averageCpv",
    "videoPlays",
    "videoViews",
    "videoViewsTo25",
    "videoViewsTo50",
    "videoViewsTo75",
    "videoViewsTo95",
    "videoViewsTo100",
    "videoViewsTo3Sec",
    "averageRateVideoViewed",
    "averageDurationVideoViewed"
})
public class Stats {

    protected Long imps;
    protected Double clickRate;
    protected Double totalClickCost;
    protected Long clickCnt;
    protected Double avgClickCost;
    protected String conversions;
    protected Double conversionRate;
    protected String cpa;
    protected String conversionValue;
    protected String valuePerConversions;
    protected Long allConversions;
    protected Double allConversionRate;
    protected String allCpa;
    protected String allConversionValue;
    protected String valuePerAllConversions;
    protected Double avgDeliverRank;
    protected Long totalVimps;
    protected Long vImps;
    protected Long inViewClickCnt;
    protected Double inViewRate;
    protected Double inViewClickRate;
    protected Long autoVideoPlays;
    protected Long clickVideoPlays;
    protected Double videoViewedRate;
    protected Long paidVideoViews;
    protected Double paidVideoViewRate;
    protected Double averageCpv;
    protected Long videoPlays;
    protected Long videoViews;
    protected Long videoViewsTo25;
    protected Long videoViewsTo50;
    protected Long videoViewsTo75;
    protected Long videoViewsTo95;
    protected Long videoViewsTo100;
    protected Long videoViewsTo3Sec;
    protected Double averageRateVideoViewed;
    protected Double averageDurationVideoViewed;

    /**
     * Gets the value of the imps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImps() {
        return imps;
    }

    /**
     * Sets the value of the imps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImps(Long value) {
        this.imps = value;
    }

    /**
     * Gets the value of the clickRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickRate() {
        return clickRate;
    }

    /**
     * Sets the value of the clickRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickRate(Double value) {
        this.clickRate = value;
    }

    /**
     * Gets the value of the totalClickCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalClickCost() {
        return totalClickCost;
    }

    /**
     * Sets the value of the totalClickCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalClickCost(Double value) {
        this.totalClickCost = value;
    }

    /**
     * Gets the value of the clickCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClickCnt() {
        return clickCnt;
    }

    /**
     * Sets the value of the clickCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClickCnt(Long value) {
        this.clickCnt = value;
    }

    /**
     * Gets the value of the avgClickCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgClickCost() {
        return avgClickCost;
    }

    /**
     * Sets the value of the avgClickCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgClickCost(Double value) {
        this.avgClickCost = value;
    }

    /**
     * Gets the value of the conversions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversions() {
        return conversions;
    }

    /**
     * Sets the value of the conversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversions(String value) {
        this.conversions = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionRate(Double value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the cpa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpa() {
        return cpa;
    }

    /**
     * Sets the value of the cpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpa(String value) {
        this.cpa = value;
    }

    /**
     * Gets the value of the conversionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionValue() {
        return conversionValue;
    }

    /**
     * Sets the value of the conversionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionValue(String value) {
        this.conversionValue = value;
    }

    /**
     * Gets the value of the valuePerConversions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuePerConversions() {
        return valuePerConversions;
    }

    /**
     * Sets the value of the valuePerConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuePerConversions(String value) {
        this.valuePerConversions = value;
    }

    /**
     * Gets the value of the allConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAllConversions() {
        return allConversions;
    }

    /**
     * Sets the value of the allConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllConversions(Long value) {
        this.allConversions = value;
    }

    /**
     * Gets the value of the allConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAllConversionRate() {
        return allConversionRate;
    }

    /**
     * Sets the value of the allConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAllConversionRate(Double value) {
        this.allConversionRate = value;
    }

    /**
     * Gets the value of the allCpa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllCpa() {
        return allCpa;
    }

    /**
     * Sets the value of the allCpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllCpa(String value) {
        this.allCpa = value;
    }

    /**
     * Gets the value of the allConversionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllConversionValue() {
        return allConversionValue;
    }

    /**
     * Sets the value of the allConversionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllConversionValue(String value) {
        this.allConversionValue = value;
    }

    /**
     * Gets the value of the valuePerAllConversions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuePerAllConversions() {
        return valuePerAllConversions;
    }

    /**
     * Sets the value of the valuePerAllConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuePerAllConversions(String value) {
        this.valuePerAllConversions = value;
    }

    /**
     * Gets the value of the avgDeliverRank property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgDeliverRank() {
        return avgDeliverRank;
    }

    /**
     * Sets the value of the avgDeliverRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgDeliverRank(Double value) {
        this.avgDeliverRank = value;
    }

    /**
     * Gets the value of the totalVimps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalVimps() {
        return totalVimps;
    }

    /**
     * Sets the value of the totalVimps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalVimps(Long value) {
        this.totalVimps = value;
    }

    /**
     * Gets the value of the vImps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVImps() {
        return vImps;
    }

    /**
     * Sets the value of the vImps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVImps(Long value) {
        this.vImps = value;
    }

    /**
     * Gets the value of the inViewClickCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInViewClickCnt() {
        return inViewClickCnt;
    }

    /**
     * Sets the value of the inViewClickCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInViewClickCnt(Long value) {
        this.inViewClickCnt = value;
    }

    /**
     * Gets the value of the inViewRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInViewRate() {
        return inViewRate;
    }

    /**
     * Sets the value of the inViewRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInViewRate(Double value) {
        this.inViewRate = value;
    }

    /**
     * Gets the value of the inViewClickRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInViewClickRate() {
        return inViewClickRate;
    }

    /**
     * Sets the value of the inViewClickRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInViewClickRate(Double value) {
        this.inViewClickRate = value;
    }

    /**
     * Gets the value of the autoVideoPlays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAutoVideoPlays() {
        return autoVideoPlays;
    }

    /**
     * Sets the value of the autoVideoPlays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAutoVideoPlays(Long value) {
        this.autoVideoPlays = value;
    }

    /**
     * Gets the value of the clickVideoPlays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClickVideoPlays() {
        return clickVideoPlays;
    }

    /**
     * Sets the value of the clickVideoPlays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClickVideoPlays(Long value) {
        this.clickVideoPlays = value;
    }

    /**
     * Gets the value of the videoViewedRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVideoViewedRate() {
        return videoViewedRate;
    }

    /**
     * Sets the value of the videoViewedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVideoViewedRate(Double value) {
        this.videoViewedRate = value;
    }

    /**
     * Gets the value of the paidVideoViews property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaidVideoViews() {
        return paidVideoViews;
    }

    /**
     * Sets the value of the paidVideoViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaidVideoViews(Long value) {
        this.paidVideoViews = value;
    }

    /**
     * Gets the value of the paidVideoViewRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaidVideoViewRate() {
        return paidVideoViewRate;
    }

    /**
     * Sets the value of the paidVideoViewRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaidVideoViewRate(Double value) {
        this.paidVideoViewRate = value;
    }

    /**
     * Gets the value of the averageCpv property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCpv() {
        return averageCpv;
    }

    /**
     * Sets the value of the averageCpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCpv(Double value) {
        this.averageCpv = value;
    }

    /**
     * Gets the value of the videoPlays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoPlays() {
        return videoPlays;
    }

    /**
     * Sets the value of the videoPlays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoPlays(Long value) {
        this.videoPlays = value;
    }

    /**
     * Gets the value of the videoViews property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoViews() {
        return videoViews;
    }

    /**
     * Sets the value of the videoViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoViews(Long value) {
        this.videoViews = value;
    }

    /**
     * Gets the value of the videoViewsTo25 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoViewsTo25() {
        return videoViewsTo25;
    }

    /**
     * Sets the value of the videoViewsTo25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoViewsTo25(Long value) {
        this.videoViewsTo25 = value;
    }

    /**
     * Gets the value of the videoViewsTo50 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoViewsTo50() {
        return videoViewsTo50;
    }

    /**
     * Sets the value of the videoViewsTo50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoViewsTo50(Long value) {
        this.videoViewsTo50 = value;
    }

    /**
     * Gets the value of the videoViewsTo75 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoViewsTo75() {
        return videoViewsTo75;
    }

    /**
     * Sets the value of the videoViewsTo75 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoViewsTo75(Long value) {
        this.videoViewsTo75 = value;
    }

    /**
     * Gets the value of the videoViewsTo95 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoViewsTo95() {
        return videoViewsTo95;
    }

    /**
     * Sets the value of the videoViewsTo95 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoViewsTo95(Long value) {
        this.videoViewsTo95 = value;
    }

    /**
     * Gets the value of the videoViewsTo100 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoViewsTo100() {
        return videoViewsTo100;
    }

    /**
     * Sets the value of the videoViewsTo100 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoViewsTo100(Long value) {
        this.videoViewsTo100 = value;
    }

    /**
     * Gets the value of the videoViewsTo3Sec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoViewsTo3Sec() {
        return videoViewsTo3Sec;
    }

    /**
     * Sets the value of the videoViewsTo3Sec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoViewsTo3Sec(Long value) {
        this.videoViewsTo3Sec = value;
    }

    /**
     * Gets the value of the averageRateVideoViewed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageRateVideoViewed() {
        return averageRateVideoViewed;
    }

    /**
     * Sets the value of the averageRateVideoViewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageRateVideoViewed(Double value) {
        this.averageRateVideoViewed = value;
    }

    /**
     * Gets the value of the averageDurationVideoViewed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageDurationVideoViewed() {
        return averageDurationVideoViewed;
    }

    /**
     * Sets the value of the averageDurationVideoViewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageDurationVideoViewed(Double value) {
        this.averageDurationVideoViewed = value;
    }

}
