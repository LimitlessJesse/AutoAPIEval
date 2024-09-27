import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JAXB_2 {
    public static void main(String[] args) {
        try {
            // Create a JAXBContext for the specified class
            JAXBContext jaxbContext = JAXBContext.newInstance(YourClassName.class);

            // Create a Marshaller
            Marshaller marshaller = jaxbContext.createMarshaller();

            // Create an instance of your class to be marshalled
            YourClassName obj = new YourClassName();

            // Specify the file where the XML will be written
            File xmlFile = new File("output.xml");

            // Call the marshal method to write the object to XML
            marshaller.marshal(obj, xmlFile);

            System.out.println("Object marshalled successfully to XML file.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
