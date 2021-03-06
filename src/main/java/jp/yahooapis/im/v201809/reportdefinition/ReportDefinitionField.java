
package jp.yahooapis.im.v201809.reportdefinition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportDefinitionField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDefinitionField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayFieldNameJA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayFieldNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="impossibleCombinationFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDefinitionField", propOrder = {
    "fieldName",
    "displayFieldNameJA",
    "displayFieldNameEN",
    "xmlAttributeName",
    "fieldType",
    "filterable",
    "impossibleCombinationFields"
})
public class ReportDefinitionField {

    protected String fieldName;
    protected String displayFieldNameJA;
    protected String displayFieldNameEN;
    protected String xmlAttributeName;
    protected String fieldType;
    protected Boolean filterable;
    protected List<String> impossibleCombinationFields;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the displayFieldNameJA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFieldNameJA() {
        return displayFieldNameJA;
    }

    /**
     * Sets the value of the displayFieldNameJA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFieldNameJA(String value) {
        this.displayFieldNameJA = value;
    }

    /**
     * Gets the value of the displayFieldNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFieldNameEN() {
        return displayFieldNameEN;
    }

    /**
     * Sets the value of the displayFieldNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFieldNameEN(String value) {
        this.displayFieldNameEN = value;
    }

    /**
     * Gets the value of the xmlAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlAttributeName() {
        return xmlAttributeName;
    }

    /**
     * Sets the value of the xmlAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlAttributeName(String value) {
        this.xmlAttributeName = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the filterable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterable() {
        return filterable;
    }

    /**
     * Sets the value of the filterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterable(Boolean value) {
        this.filterable = value;
    }

    /**
     * Gets the value of the impossibleCombinationFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impossibleCombinationFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpossibleCombinationFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImpossibleCombinationFields() {
        if (impossibleCombinationFields == null) {
            impossibleCombinationFields = new ArrayList<String>();
        }
        return this.impossibleCombinationFields;
    }

}
