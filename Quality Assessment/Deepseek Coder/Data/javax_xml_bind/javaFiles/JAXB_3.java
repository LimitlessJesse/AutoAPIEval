import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class JAXB_3 {
    public static void main(String[] args) {
        String xml = "<root>Hello World</root>";
        try {
            JAXBContext jc = JAXBContext.newInstance(String.class);
            Unmarshaller um = jc.createUnmarshaller();
            String result = (String) um.unmarshal(new StringReader(xml));
            System.out.println(result);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
