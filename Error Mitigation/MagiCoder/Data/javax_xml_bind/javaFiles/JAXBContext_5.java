import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.Validator;

public class JAXBContext_5 {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(MyClass.class);
            Validator validator = jc.createValidator();

            ValidationEventHandler eventHandler = new ValidationEventHandler() {
                public boolean handleEvent(ValidationEvent event) {
                    System.out.println(event.getMessage());
                    return true;
                }
            };

            validator.setEventHandler(eventHandler);

            // Use the validator here...

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
