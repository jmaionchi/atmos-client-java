//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.23 at 11:11:22 AM CDT 
//


package com.emc.cdp.mgmt.bean;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Invitation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invitation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetAccountRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inviteeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inviterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inviteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="handleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invitation", propOrder = {
    "id",
    "accountId",
    "targetAccountRole",
    "inviteeId",
    "inviterId",
    "state",
    "inviteTime",
    "handleTime"
})
@XmlRootElement(name = "invitation")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
public class Invitation {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String accountId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String targetAccountRole;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String inviteeId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String inviterId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected String state;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected XMLGregorianCalendar inviteTime;
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    protected XMLGregorianCalendar handleTime;

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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the targetAccountRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public String getTargetAccountRole() {
        return targetAccountRole;
    }

    /**
     * Sets the value of the targetAccountRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setTargetAccountRole(String value) {
        this.targetAccountRole = value;
    }

    /**
     * Gets the value of the inviteeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public String getInviteeId() {
        return inviteeId;
    }

    /**
     * Sets the value of the inviteeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setInviteeId(String value) {
        this.inviteeId = value;
    }

    /**
     * Gets the value of the inviterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public String getInviterId() {
        return inviterId;
    }

    /**
     * Sets the value of the inviterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setInviterId(String value) {
        this.inviterId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the inviteTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public XMLGregorianCalendar getInviteTime() {
        return inviteTime;
    }

    /**
     * Sets the value of the inviteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setInviteTime(XMLGregorianCalendar value) {
        this.inviteTime = value;
    }

    /**
     * Gets the value of the handleTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public XMLGregorianCalendar getHandleTime() {
        return handleTime;
    }

    /**
     * Sets the value of the handleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-05-23T11:11:22-05:00", comments = "JAXB RI v2.2.4")
    public void setHandleTime(XMLGregorianCalendar value) {
        this.handleTime = value;
    }

}
