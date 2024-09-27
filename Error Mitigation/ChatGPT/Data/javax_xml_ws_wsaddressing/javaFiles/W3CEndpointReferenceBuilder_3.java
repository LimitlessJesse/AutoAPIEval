import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;
import org.w3c.dom.Element;

public class W3CEndpointReferenceBuilder_3 {
    public static void main(String[] args) {
        W3CEndpointReferenceBuilder builder = new W3CEndpointReferenceBuilder();
        Element metadataElement = null; // Initialize with your metadata element
        
        try {
            builder.metadata(metadataElement);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
