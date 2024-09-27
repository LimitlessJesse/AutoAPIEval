import javax.xml.bind.ValidationEvent;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

public class DefaultValidationEventHandler_1 {
    public static void main(String[] args) {
        DefaultValidationEventHandler handler = new DefaultValidationEventHandler();
        ValidationEvent event = new ValidationEvent() {
            @Override
            public String getMessage() {
                return "Sample validation message";
            }

            @Override
            public String getLinkedException() {
                return null;
            }

            @Override
            public SourceLocator getLocator() {
                return null;
            }

            @Override
            public Object getRelatedException() {
                return null;
            }

            @Override
            public Object getRelatedObject() {
                return null;
            }

            @Override
            public int getSeverity() {
                return 0;
            }

            @Override
            public String getType() {
                return null;
            }
        };

        boolean shouldContinue = handler.handleEvent(event);
        System.out.println("Should continue: " + shouldContinue);
    }
}
