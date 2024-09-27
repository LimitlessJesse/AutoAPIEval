import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.helpers.AbstractMarshallerImpl;

public class AbstractMarshallerImpl_4 {
    public static void main(String[] args) {
        AbstractMarshallerImpl marshaller = new AbstractMarshallerImpl();
        marshaller.setEventHandler(new ValidationEventHandler() {
            @Override
            public boolean handleEvent(ValidationEvent event) {
                System.out.println("Validation event: " + event.getMessage());
                return true;
            }
        });
    }
}
