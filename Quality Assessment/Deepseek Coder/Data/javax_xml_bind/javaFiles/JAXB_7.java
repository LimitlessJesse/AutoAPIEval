import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JAXB_7 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("path_to_your_xml_file");
            JAXBContext jaxbContext = JAXBContext.newInstance(YourClass.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            YourClass yourObject = (YourClass) unmarshaller.unmarshal(fileInputStream);
            System.out.println(yourObject.toString());
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
