import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBContext_2 {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("your.package.name");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            // Use the unmarshaller object to convert XML data into a java content tree
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
