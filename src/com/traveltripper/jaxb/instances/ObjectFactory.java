package com.traveltripper.jaxb.instances;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Flowlauncher }
     * 
     */
    public Flowlauncher createFlowlauncher() {
        return new Flowlauncher();
    }

    /**
     * Create an instance of {@link Flowlauncher.Flow }
     * 
     */
    public Flowlauncher.Flow createFlowlauncherFlow() {
        return new Flowlauncher.Flow();
    }

    /**
     * Create an instance of {@link Flowlauncher.Flow.Navigate }
     * 
     */
    public Flowlauncher.Flow.Navigate createFlowlauncherFlowNavigate() {
        return new Flowlauncher.Flow.Navigate();
    }

    /**
     * Create an instance of {@link Flowlauncher.Flow.Navigate.Fields }
     * 
     */
    public Flowlauncher.Flow.Navigate.Fields createFlowlauncherFlowNavigateFields() {
        return new Flowlauncher.Flow.Navigate.Fields();
    }

    /**
     * Create an instance of {@link Flowlauncher.Flow.Navigate.Fields.Screenshot }
     * 
     */
    public Flowlauncher.Flow.Navigate.Fields.Screenshot createFlowlauncherFlowNavigateFieldsScreenshot() {
        return new Flowlauncher.Flow.Navigate.Fields.Screenshot();
    }

    /**
     * Create an instance of {@link Flowlauncher.Flow.Navigate.Fields.Field }
     * 
     */
    public Flowlauncher.Flow.Navigate.Fields.Field createFlowlauncherFlowNavigateFieldsField() {
        return new Flowlauncher.Flow.Navigate.Fields.Field();
    }

    /**
     * Create an instance of {@link Flowlauncher.Flow.Navigate.Fields.Action }
     * 
     */
    public Flowlauncher.Flow.Navigate.Fields.Action createFlowlauncherFlowNavigateFieldsAction() {
        return new Flowlauncher.Flow.Navigate.Fields.Action();
    }

}
