import org.xml.sax.AttributeList;
import org.xml.sax.HandlerBase;

public class HandlerBase_2 extends HandlerBase {
    public void startElement(String name, AttributeList atts) {
        System.out.println("Start Element: " + name);
        if (atts != null) {
            for (int i = 0; i < atts.getLength(); i++) {
                System.out.println("Attribute - Name: " + atts.getName(i) + ", Value: " + atts.getValue(i));
            }
        }
    }
    
    public static void main(String[] args) {
        Main handler = new Main();
        
        // Simulate calling the startElement method
        AttributeList attributes = new AttributeList() {
            @Override
            public int getLength() {
                return 2;
            }

            @Override
            public String getName(int i) {
                if (i == 0) {
                    return "id";
                } else {
                    return "value";
                }
            }

            @Override
            public String getType(int i) {
                return null;
            }

            @Override
            public String getType(String s) {
                return null;
            }

            @Override
            public String getValue(int i) {
                if (i == 0) {
                    return "123";
                } else {
                    return "example";
                }
            }

            @Override
            public String getValue(String s) {
                return null;
            }
        };
        
        handler.startElement("element1", attributes);
    }
}
