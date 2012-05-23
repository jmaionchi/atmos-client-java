//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.23 at 11:11:22 AM CDT 
//


package com.emc.cdp.mgmt.bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="state" type="{http://cdp.emc.com/services/rest/model}subscriptionState" minOccurs="0"/>
 *         &lt;element name="agreementUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://cdp.emc.com/services/rest/model}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "id",
    "serviceId",
    "effectiveDate",
    "state",
    "agreementUrl",
    "attributes"
})
@XmlRootElement(name = "subscription")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
public class Subscription {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String id;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String serviceId;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected XMLGregorianCalendar effectiveDate;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected SubscriptionState state;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String agreementUrl;
    @XmlElement(name = "attribute")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected List<Attribute> attributes;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionState }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public SubscriptionState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionState }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setState(SubscriptionState value) {
        this.state = value;
    }

    /**
     * Gets the value of the agreementUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public String getAgreementUrl() {
        return agreementUrl;
    }

    /**
     * Sets the value of the agreementUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setAgreementUrl(String value) {
        this.agreementUrl = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Attribute>();
        }
        return this.attributes;
    }

}
