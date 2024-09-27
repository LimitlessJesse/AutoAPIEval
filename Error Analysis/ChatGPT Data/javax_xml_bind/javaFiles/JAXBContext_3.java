import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBContext_3 {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(MyClass.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            
            // Your code here to use the Marshaller
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
