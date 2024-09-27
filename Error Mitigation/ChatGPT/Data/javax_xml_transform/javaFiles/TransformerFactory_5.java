import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerConfigurationException;

public class TransformerFactory_5 {
    public static void main(String[] args) {
        TransformerFactory factory = TransformerFactory.newInstance();
        
        try {
            factory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            System.out.println("Feature set successfully.");
        } catch (TransformerConfigurationException e) {
            System.out.println("Error setting feature: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Feature name is null.");
        }
    }
}
