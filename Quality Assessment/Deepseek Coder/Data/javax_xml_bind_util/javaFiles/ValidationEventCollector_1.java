import javax.xml.bind.ValidationEvent;
import javax.xml.bind.util.ValidationEventCollector;

public class ValidationEventCollector_1 {
    public static void main(String[] args) {
        ValidationEventCollector collector = new ValidationEventCollector();
        ValidationEvent event = new ValidationEvent() {
            @Override
            public ValidationEventLocator getLocator() {
                return null;
            }

            @Override
            public String getMessage() {
                return null;
            }

            @Override
            public String getLinkedException() {
                return null;
            }

            @Override
            public SourceLocator getSource() {
                return null;
            }

            @Override
            public boolean isFatal() {
                return false;
            }

            @Override
            public boolean isAssociated() {
                return false;
            }
        };

        collector.add(event);

        boolean hasEvents = collector.hasEvents();
        System.out.println("Has events: " + hasEvents);
    }
}
