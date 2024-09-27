import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.URL;

public class JAXB_6 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com/yourfile.xml");
            JAXBContext jc = JAXBContext.newInstance(YourClass.class);
            Unmarshaller um = jc.createUnmarshaller();
            YourClass obj = um.unmarshal(url, YourClass.class);
            System.out.println(obj);
        } catch (JAXBException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
