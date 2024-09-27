import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXB_4 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_xml_file");
            JAXBContext jaxbContext = JAXBContext.newInstance(YourRootElementClass.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            YourRootElementClass rootElement = (YourRootElementClass) jaxbUnmarshaller.unmarshal(file);

            System.out.println(rootElement.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
