import org.xml.sax.AttributeList;
import org.xml.sax.HandlerBase;

public class HandlerBase_4 extends HandlerBase {
    public static void main(String[] args) {
        HandlerBase_4 handler = new HandlerBase_4();
        handler.startElement("elementName", new AttributeList());
    }

    public void startElement(String name, AttributeList attributes) {
        // Add your implementation here
        System.out.println("Start element: " + name);
    }
}
