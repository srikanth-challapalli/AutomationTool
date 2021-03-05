
package com.traveltripper.jaxb.instances;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flow"
})
@XmlRootElement(name = "flowlauncher")
public class Flowlauncher {

    @XmlElement(required = true)
    protected Flowlauncher.Flow flow;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the flow property.
     * 
     * @return
     *     possible object is
     *     {@link Flowlauncher.Flow }
     *     
     */
    public Flowlauncher.Flow getFlow() {
        return flow;
    }

    /**
     * Sets the value of the flow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flowlauncher.Flow }
     *     
     */
    public void setFlow(Flowlauncher.Flow value) {
        this.flow = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="navigate" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fields">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                             &lt;element name="screenshot">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="isRequired" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="fullscreen" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="field">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="cssClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="changeFocusTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="iframe" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="autofill" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="action">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="cssClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="validate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="changeFocusTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="iframe" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="autofill" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                 &lt;attribute name="pageName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="screenshot" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="baseUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "navigate"
    })
    public static class Flow {

        protected List<Flowlauncher.Flow.Navigate> navigate;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "baseUrl")
        @XmlSchemaType(name = "anyURI")
        protected String baseUrl;

        /**
         * Gets the value of the navigate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the navigate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNavigate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Flowlauncher.Flow.Navigate }
         * 
         * 
         */
        public List<Flowlauncher.Flow.Navigate> getNavigate() {
            if (navigate == null) {
                navigate = new ArrayList<Flowlauncher.Flow.Navigate>();
            }
            return this.navigate;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the baseUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaseUrl() {
            return baseUrl;
        }

        /**
         * Sets the value of the baseUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBaseUrl(String value) {
            this.baseUrl = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="fields">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
         *                   &lt;element name="screenshot">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="isRequired" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="fullscreen" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="field">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="cssClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="changeFocusTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="iframe" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="autofill" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="action">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="cssClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="validate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="changeFocusTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="iframe" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="autofill" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *       &lt;attribute name="pageName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="screenshot" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fields"
        })
        public static class Navigate {

            @XmlElement(required = true)
            protected Flowlauncher.Flow.Navigate.Fields fields;
            @XmlAttribute(name = "index")
            protected Byte index;
            @XmlAttribute(name = "pageName")
            protected String pageName;
         

            /**
             * Gets the value of the fields property.
             * 
             * @return
             *     possible object is
             *     {@link Flowlauncher.Flow.Navigate.Fields }
             *     
             */
            public Flowlauncher.Flow.Navigate.Fields getFields() {
                return fields;
            }

            /**
             * Sets the value of the fields property.
             * 
             * @param value
             *     allowed object is
             *     {@link Flowlauncher.Flow.Navigate.Fields }
             *     
             */
            public void setFields(Flowlauncher.Flow.Navigate.Fields value) {
                this.fields = value;
            }

            /**
             * Gets the value of the index property.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getIndex() {
                return index;
            }

            /**
             * Sets the value of the index property.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setIndex(Byte value) {
                this.index = value;
            }

            /**
             * Gets the value of the pageName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPageName() {
                return pageName;
            }

            /**
             * Sets the value of the pageName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPageName(String value) {
                this.pageName = value;
            }

            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice maxOccurs="unbounded" minOccurs="0">
             *         &lt;element name="screenshot">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="isRequired" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="fullscreen" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="field">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="cssClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="changeFocusTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="iframe" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="autofill" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="action">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="cssClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="validate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="changeFocusTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="iframe" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="autofill" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "screenshotOrFieldOrAction"
            })
            public static class Fields {

                @XmlElements({
                    @XmlElement(name = "screenshot", type = Flowlauncher.Flow.Navigate.Fields.Screenshot.class),
                    @XmlElement(name = "field", type = Flowlauncher.Flow.Navigate.Fields.Field.class),
                    @XmlElement(name = "action", type = Flowlauncher.Flow.Navigate.Fields.Action.class)
                })
                protected List<Object> screenshotOrFieldOrAction;

                /**
                 * Gets the value of the screenshotOrFieldOrAction property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the screenshotOrFieldOrAction property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getScreenshotOrFieldOrAction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Flowlauncher.Flow.Navigate.Fields.Screenshot }
                 * {@link Flowlauncher.Flow.Navigate.Fields.Field }
                 * {@link Flowlauncher.Flow.Navigate.Fields.Action }
                 * 
                 * 
                 */
                public List<Object> getScreenshotOrFieldOrAction() {
                    if (screenshotOrFieldOrAction == null) {
                        screenshotOrFieldOrAction = new ArrayList<Object>();
                    }
                    return this.screenshotOrFieldOrAction;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="cssClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="validate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="changeFocusTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="iframe" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="autofill" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id",
                    "name",
                    "type",
                    "cssClass",
                    "className",
                    "xpath",
                    "value",
                    "validate",
                    "changeFocusTo",
                    "async"
                })
                public static class Action {

                    protected String id;
                    @XmlElement(required = true)
                    protected String name;
                    protected String type;
                    protected String cssClass;
                    protected String className;
                    @XmlElement(required = true)
                    protected String xpath;
                    protected String value;
                    protected String validate;
                    @XmlElement(required = true)
                    protected String changeFocusTo;
                    @XmlElement(required = true)
                    protected Long async;
                    @XmlAttribute(name = "from")
                    protected String from;
                    @XmlAttribute(name = "to")
                    protected String to;
                    @XmlAttribute(name = "fieldName")
                    protected String fieldName;
                    @XmlAttribute(name = "inputValue")
                    protected String inputValue;
                    @XmlAttribute(name = "required")
                    protected String required;
                    @XmlAttribute(name = "inputType")
                    protected String inputType;
                    @XmlAttribute(name = "iframe")
                    protected String iframe;
                    @XmlAttribute(name = "autofill")
                    protected String autofill;

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
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
                    public void setId(String value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the cssClass property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCssClass() {
                        return cssClass;
                    }

                    /**
                     * Sets the value of the cssClass property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCssClass(String value) {
                        this.cssClass = value;
                    }

                    /**
                     * Gets the value of the className property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClassName() {
                        return className;
                    }

                    /**
                     * Sets the value of the className property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClassName(String value) {
                        this.className = value;
                    }

                    /**
                     * Gets the value of the xpath property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXpath() {
                        return xpath;
                    }

                    /**
                     * Sets the value of the xpath property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXpath(String value) {
                        this.xpath = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the validate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValidate() {
                        return validate;
                    }

                    /**
                     * Sets the value of the validate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValidate(String value) {
                        this.validate = value;
                    }

                    /**
                     * Gets the value of the changeFocusTo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChangeFocusTo() {
                        return changeFocusTo;
                    }

                    /**
                     * Sets the value of the changeFocusTo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChangeFocusTo(String value) {
                        this.changeFocusTo = value;
                    }

                    /**
                     * Gets the value of the async property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public Long getAsync() {
                        return async;
                    }

                    /**
                     * Sets the value of the async property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAsync(Long value) {
                        this.async = value;
                    }

                    /**
                     * Gets the value of the from property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFrom() {
                        return from;
                    }

                    /**
                     * Sets the value of the from property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFrom(String value) {
                        this.from = value;
                    }

                    /**
                     * Gets the value of the to property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTo() {
                        return to;
                    }

                    /**
                     * Sets the value of the to property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTo(String value) {
                        this.to = value;
                    }

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
                     * Gets the value of the inputValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInputValue() {
                        return inputValue;
                    }

                    /**
                     * Sets the value of the inputValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInputValue(String value) {
                        this.inputValue = value;
                    }

                    /**
                     * Gets the value of the required property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRequired() {
                        return required;
                    }

                    /**
                     * Sets the value of the required property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRequired(String value) {
                        this.required = value;
                    }

                    /**
                     * Gets the value of the inputType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInputType() {
                        return inputType;
                    }

                    /**
                     * Sets the value of the inputType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInputType(String value) {
                        this.inputType = value;
                    }

                    /**
                     * Gets the value of the iframe property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIframe() {
                        return iframe;
                    }

                    /**
                     * Sets the value of the iframe property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIframe(String value) {
                        this.iframe = value;
                    }

                    /**
                     * Gets the value of the autofill property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAutofill() {
                        return autofill;
                    }

                    /**
                     * Sets the value of the autofill property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAutofill(String value) {
                        this.autofill = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="cssClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="changeFocusTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}byte"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="iframe" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="autofill" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id",
                    "name",
                    "cssClass",
                    "className",
                    "xpath",
                    "changeFocusTo",
                    "async"
                })
                public static class Field {

                    @XmlElement(required = true)
                    protected String id;
                    @XmlElement(required = true)
                    protected String name;
                    @XmlElement(required = true)
                    protected String cssClass;
                    @XmlElement(required = true)
                    protected String className;
                    @XmlElement(required = true)
                    protected String xpath;
                    @XmlElement(required = true)
                    protected String changeFocusTo;
                    protected byte async;
                    @XmlAttribute(name = "fieldName")
                    protected String fieldName;
                    @XmlAttribute(name = "inputValue")
                    protected String inputValue;
                    @XmlAttribute(name = "required")
                    protected String required;
                    @XmlAttribute(name = "inputType")
                    protected String inputType;
                    @XmlAttribute(name = "iframe")
                    protected String iframe;
                    @XmlAttribute(name = "autofill")
                    protected String autofill;
                    @XmlAttribute(name = "proceedIfNotPresent")
                    protected boolean proceedIfNotPresent;

                    /**
                     * Gets the value of the id property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
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
                    public void setId(String value) {
                        this.id = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the cssClass property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCssClass() {
                        return cssClass;
                    }

                    /**
                     * Sets the value of the cssClass property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCssClass(String value) {
                        this.cssClass = value;
                    }

                    /**
                     * Gets the value of the className property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClassName() {
                        return className;
                    }

                    /**
                     * Sets the value of the className property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClassName(String value) {
                        this.className = value;
                    }

                    /**
                     * Gets the value of the xpath property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXpath() {
                        return xpath;
                    }

                    /**
                     * Sets the value of the xpath property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXpath(String value) {
                        this.xpath = value;
                    }

                    /**
                     * Gets the value of the changeFocusTo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChangeFocusTo() {
                        return changeFocusTo;
                    }

                    /**
                     * Sets the value of the changeFocusTo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChangeFocusTo(String value) {
                        this.changeFocusTo = value;
                    }

                    /**
                     * Gets the value of the async property.
                     * 
                     */
                    public byte getAsync() {
                        return async;
                    }

                    /**
                     * Sets the value of the async property.
                     * 
                     */
                    public void setAsync(byte value) {
                        this.async = value;
                    }

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
                     * Gets the value of the inputValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInputValue() {
                        return inputValue;
                    }

                    /**
                     * Sets the value of the inputValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInputValue(String value) {
                        this.inputValue = value;
                    }

                    /**
                     * Gets the value of the required property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRequired() {
                        return required;
                    }

                    /**
                     * Sets the value of the required property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRequired(String value) {
                        this.required = value;
                    }

                    /**
                     * Gets the value of the inputType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInputType() {
                        return inputType;
                    }

                    /**
                     * Sets the value of the inputType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInputType(String value) {
                        this.inputType = value;
                    }

                    /**
                     * Gets the value of the iframe property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIframe() {
                        return iframe;
                    }

                    /**
                     * Sets the value of the iframe property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIframe(String value) {
                        this.iframe = value;
                    }

                    /**
                     * Gets the value of the autofill property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAutofill() {
                        return autofill;
                    }

                    /**
                     * Sets the value of the autofill property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAutofill(String value) {
                        this.autofill = value;
                    }

					/**
					 * @return the proceedIfNotPresent
					 */
					public boolean isProceedIfNotPresent() {
						return proceedIfNotPresent;
					}

					/**
					 * @param proceedIfNotPresent the proceedIfNotPresent to set
					 */
					public void setProceedIfNotPresent(boolean proceedIfNotPresent) {
						this.proceedIfNotPresent = proceedIfNotPresent;
					}
                    
                    

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="isRequired" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="fullscreen" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Screenshot {
//<screenshot isRequired="true" name="ceasars_property_selection" format="jpg" fullscreen="false" waitTime="10"/>
                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "isRequired")
                    protected String isRequired;
                    @XmlAttribute(name = "name")
                    protected String name;
                    @XmlAttribute(name = "format")
                    protected String format;
                    @XmlAttribute(name = "fullscreen")
                    protected String fullscreen;
                    @XmlAttribute(name="waitTime")
                    protected String waitTime;

                    /**
					 * @return the waitTime
					 */
					public String getWaitTime() {
						return waitTime;
					}

					/**
					 * @param waitTime the waitTime to set
					 */
					public void setWaitTime(String waitTime) {
						this.waitTime = waitTime;
					}

					/**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the isRequired property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIsRequired() {
                        return isRequired;
                    }

                    /**
                     * Sets the value of the isRequired property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIsRequired(String value) {
                        this.isRequired = value;
                    }

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the format property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFormat() {
                        return format;
                    }

                    /**
                     * Sets the value of the format property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFormat(String value) {
                        this.format = value;
                    }

                    /**
                     * Gets the value of the fullscreen property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFullscreen() {
                        return fullscreen;
                    }

                    /**
                     * Sets the value of the fullscreen property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFullscreen(String value) {
                        this.fullscreen = value;
                    }
                    
                    

                }

            }

        }

    }

}
