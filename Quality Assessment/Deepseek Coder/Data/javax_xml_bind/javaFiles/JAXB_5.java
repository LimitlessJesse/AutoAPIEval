import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXB_5 {
    public static void main(String[] args) {
        File file = new File("path_to_your_xml_file");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(YourRootElementClass.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            YourRootElementClass rootElement = (YourRootElementClass) jaxbUnmarshaller.unmarshal(file);
            System.out.println(rootElement);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
