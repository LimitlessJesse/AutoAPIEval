import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBContext_2 {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(MyClass.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Use unmarshaller to deserialize XML to Java object
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    // Define properties and methods here
}
