
package de.ifcore.metis.jaxws.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.ifcore.metis.jaxws.message.soap.message package. 
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

    private final static QName _InvolvedCardNumber_QNAME = new QName("http://vgwort.de/1.2/MessageService/xsd", "cardNumber");
    private final static QName _InvolvedFirstName_QNAME = new QName("http://vgwort.de/1.2/MessageService/xsd", "firstName");
    private final static QName _InvolvedCode_QNAME = new QName("http://vgwort.de/1.2/MessageService/xsd", "code");
    private final static QName _InvolvedSurName_QNAME = new QName("http://vgwort.de/1.2/MessageService/xsd", "surName");
    private final static QName _PartiesTranslators_QNAME = new QName("http://vgwort.de/1.2/MessageService/xsd", "translators");
    private final static QName _PartiesAuthors_QNAME = new QName("http://vgwort.de/1.2/MessageService/xsd", "authors");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.ifcore.metis.jaxws.message.soap.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckAuthorResponse }
     * 
     */
    public CheckAuthorResponse createCheckAuthorResponse() {
        return new CheckAuthorResponse();
    }

    /**
     * Create an instance of {@link NewMessageRequest }
     * 
     */
    public NewMessageRequest createNewMessageRequest() {
        return new NewMessageRequest();
    }

    /**
     * Create an instance of {@link Parties }
     * 
     */
    public Parties createParties() {
        return new Parties();
    }

    /**
     * Create an instance of {@link MessageText }
     * 
     */
    public MessageText createMessageText() {
        return new MessageText();
    }

    /**
     * Create an instance of {@link Webranges }
     * 
     */
    public Webranges createWebranges() {
        return new Webranges();
    }

    /**
     * Create an instance of {@link QualityControlFault }
     * 
     */
    public QualityControlFault createQualityControlFault() {
        return new QualityControlFault();
    }

    /**
     * Create an instance of {@link TomFault }
     * 
     */
    public TomFault createTomFault() {
        return new TomFault();
    }

    /**
     * Create an instance of {@link QualityControlResponse }
     * 
     */
    public QualityControlResponse createQualityControlResponse() {
        return new QualityControlResponse();
    }

    /**
     * Create an instance of {@link QualityControlValues }
     * 
     */
    public QualityControlValues createQualityControlValues() {
        return new QualityControlValues();
    }

    /**
     * Create an instance of {@link CheckAuthorFault }
     * 
     */
    public CheckAuthorFault createCheckAuthorFault() {
        return new CheckAuthorFault();
    }

    /**
     * Create an instance of {@link NewMessageFault }
     * 
     */
    public NewMessageFault createNewMessageFault() {
        return new NewMessageFault();
    }

    /**
     * Create an instance of {@link AddWebrangeResponse }
     * 
     */
    public AddWebrangeResponse createAddWebrangeResponse() {
        return new AddWebrangeResponse();
    }

    /**
     * Create an instance of {@link OkMessage }
     * 
     */
    public OkMessage createOkMessage() {
        return new OkMessage();
    }

    /**
     * Create an instance of {@link NewMessageResponse }
     * 
     */
    public NewMessageResponse createNewMessageResponse() {
        return new NewMessageResponse();
    }

    /**
     * Create an instance of {@link CheckAuthorRequest }
     * 
     */
    public CheckAuthorRequest createCheckAuthorRequest() {
        return new CheckAuthorRequest();
    }

    /**
     * Create an instance of {@link AddWebrangeRequest }
     * 
     */
    public AddWebrangeRequest createAddWebrangeRequest() {
        return new AddWebrangeRequest();
    }

    /**
     * Create an instance of {@link Webrange }
     * 
     */
    public Webrange createWebrange() {
        return new Webrange();
    }

    /**
     * Create an instance of {@link AddWebrangeFault }
     * 
     */
    public AddWebrangeFault createAddWebrangeFault() {
        return new AddWebrangeFault();
    }

    /**
     * Create an instance of {@link QualityControlRequest }
     * 
     */
    public QualityControlRequest createQualityControlRequest() {
        return new QualityControlRequest();
    }

    /**
     * Create an instance of {@link Translators }
     * 
     */
    public Translators createTranslators() {
        return new Translators();
    }

    /**
     * Create an instance of {@link Involved }
     * 
     */
    public Involved createInvolved() {
        return new Involved();
    }

    /**
     * Create an instance of {@link Authors }
     * 
     */
    public Authors createAuthors() {
        return new Authors();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgwort.de/1.2/MessageService/xsd", name = "cardNumber", scope = Involved.class)
    public JAXBElement<Integer> createInvolvedCardNumber(Integer value) {
        return new JAXBElement<Integer>(_InvolvedCardNumber_QNAME, Integer.class, Involved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgwort.de/1.2/MessageService/xsd", name = "firstName", scope = Involved.class)
    public JAXBElement<String> createInvolvedFirstName(String value) {
        return new JAXBElement<String>(_InvolvedFirstName_QNAME, String.class, Involved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgwort.de/1.2/MessageService/xsd", name = "code", scope = Involved.class)
    public JAXBElement<String> createInvolvedCode(String value) {
        return new JAXBElement<String>(_InvolvedCode_QNAME, String.class, Involved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgwort.de/1.2/MessageService/xsd", name = "surName", scope = Involved.class)
    public JAXBElement<String> createInvolvedSurName(String value) {
        return new JAXBElement<String>(_InvolvedSurName_QNAME, String.class, Involved.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Translators }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgwort.de/1.2/MessageService/xsd", name = "translators", scope = Parties.class)
    public JAXBElement<Translators> createPartiesTranslators(Translators value) {
        return new JAXBElement<Translators>(_PartiesTranslators_QNAME, Translators.class, Parties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgwort.de/1.2/MessageService/xsd", name = "authors", scope = Parties.class)
    public JAXBElement<Authors> createPartiesAuthors(Authors value) {
        return new JAXBElement<Authors>(_PartiesAuthors_QNAME, Authors.class, Parties.class, value);
    }

}
