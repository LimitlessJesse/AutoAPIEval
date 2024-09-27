import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Validator;

public class JAXBContext_4 {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("your.package.name");
            Validator validator = jaxbContext.createValidator();
            System.out.println("Validator object created successfully");
        } catch (JAXBException e) {
            System.out.println("Error creating Validator object: " + e.getMessage());
        }
    }
}
