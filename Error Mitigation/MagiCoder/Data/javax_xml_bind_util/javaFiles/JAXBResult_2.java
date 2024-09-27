import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBResult;
import java.io.StringReader;

public class JAXBResult_2 {
    public static void main(String[] args) {
        try {
            // Create JAXBContext
            JAXBContext jc = JAXBContext.newInstance(MyObject.class);

            // Create unmarshaller
            Unmarshaller unmarshaller = jc.createUnmarshaller();

            // Create JAXBResult
            JAXBResult jaxbResult = new JAXBResult(unmarshaller);

            // Create XML string
            String xml = "<myObject><field>value</field></myObject>";

            // Unmarshal XML
            jaxbResult.setReader(new StringReader(xml));

            // Get unmarshalled object
            MyObject myObject = (MyObject) jaxbResult.getResult();

            // Print unmarshalled object
            System.out.println(myObject);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
