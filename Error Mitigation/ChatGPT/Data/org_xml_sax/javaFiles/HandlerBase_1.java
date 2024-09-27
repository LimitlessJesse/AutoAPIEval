import org.xml.sax.Locator;
import org.xml.sax.HandlerBase;

public class HandlerBase_1 {
    public static void main(String[] args) {
        HandlerBase handler = new HandlerBase() {
            @Override
            public void setDocumentLocator(Locator locator) {
                // Override the setDocumentLocator method to store the locator for use with other document events
                System.out.println("Received Locator: " + locator);
            }
        };

        Locator locator = new Locator() {
            @Override
            public int getColumnNumber() {
                return 0;
            }

            @Override
            public int getLineNumber() {
                return 0;
            }

            @Override
            public String getPublicId() {
                return null;
            }

            @Override
            public String getSystemId() {
                return null;
            }
        };

        handler.setDocumentLocator(locator);
    }
}
