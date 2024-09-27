import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBContext_3 {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(YourClass.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            YourClass yourObject = (YourClass) unmarshaller.unmarshal(new File("yourFile.xml"));
            // Use yourObject
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
