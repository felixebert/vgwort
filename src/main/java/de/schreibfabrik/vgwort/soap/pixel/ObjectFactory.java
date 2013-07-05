
package de.schreibfabrik.vgwort.soap.pixel;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.schreibfabrik.vgwort package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.schreibfabrik.vgwort
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PixelOverviewResponse }
     * 
     */
    public PixelOverviewResponse createPixelOverviewResponse() {
        return new PixelOverviewResponse();
    }

    /**
     * Create an instance of {@link OrderPixelResponse }
     * 
     */
    public OrderPixelResponse createOrderPixelResponse() {
        return new OrderPixelResponse();
    }

    /**
     * Create an instance of {@link Pixels }
     * 
     */
    public Pixels createPixels() {
        return new Pixels();
    }

    /**
     * Create an instance of {@link OrderPixelFault }
     * 
     */
    public OrderPixelFault createOrderPixelFault() {
        return new OrderPixelFault();
    }

    /**
     * Create an instance of {@link TomFault }
     * 
     */
    public TomFault createTomFault() {
        return new TomFault();
    }

    /**
     * Create an instance of {@link PixelOverviewRequest }
     * 
     */
    public PixelOverviewRequest createPixelOverviewRequest() {
        return new PixelOverviewRequest();
    }

    /**
     * Create an instance of {@link PixelOverviewFault }
     * 
     */
    public PixelOverviewFault createPixelOverviewFault() {
        return new PixelOverviewFault();
    }

    /**
     * Create an instance of {@link OrderPixelRequest }
     * 
     */
    public OrderPixelRequest createOrderPixelRequest() {
        return new OrderPixelRequest();
    }

    /**
     * Create an instance of {@link Pixel_Type }
     * 
     */
    public Pixel_Type createPixel_Type() {
        return new Pixel_Type();
    }

}
