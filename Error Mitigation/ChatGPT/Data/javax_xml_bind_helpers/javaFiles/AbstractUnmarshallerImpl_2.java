import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;

public class AbstractUnmarshallerImpl_2 {
    public static void main(String[] args) {
        Unmarshaller unmarshaller = new AbstractUnmarshallerImpl();
        Source source = new StreamSource(new File("data.xml"));
        
        try {
            Object result = unmarshaller.unmarshal(source);
            System.out.println("Unmarshalled object: " + result);
        } catch (JAXBException e) {
            System.err.println("Error during unmarshalling: " + e.getMessage());
        }
    }
}
