import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;

public class HandlerBase_5 extends HandlerBase {
    public static void main(String[] args) {
        HandlerBase_5 handler = new HandlerBase_5();
        try {
            handler.endElement("elementName");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public void endElement(String name) throws SAXException {
        // Perform specific actions at the end of each element
        System.out.println("End of element: " + name);
    }
}
