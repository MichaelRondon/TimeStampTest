//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.12 a las 10:22:09 PM COT 
//


package edu.puj.aes.modyval.timestamptest.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.puj.aes.modyval.timestamptest.jaxb package. 
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

    private final static QName _Timestamp_QNAME = new QName("", "timestamp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.puj.aes.modyval.timestamptest.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Timestamp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timestamp")
    public JAXBElement<Timestamp> createTimestamp(Timestamp value) {
        return new JAXBElement<Timestamp>(_Timestamp_QNAME, Timestamp.class, null, value);
    }

}
