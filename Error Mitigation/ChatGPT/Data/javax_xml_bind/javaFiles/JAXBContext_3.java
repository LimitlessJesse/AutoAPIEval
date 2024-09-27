import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBContext_3 {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Object.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            // Use the marshaller object to convert a java content tree into XML data
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
