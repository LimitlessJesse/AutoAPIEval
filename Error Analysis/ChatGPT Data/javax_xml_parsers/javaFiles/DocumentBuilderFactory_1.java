import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_1 {
    public static void main(String[] args) {
        
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Use the DocumentBuilder instance to work with XML documents
            System.out.println("DocumentBuilder instance created successfully.");
            
        } catch (Exception e) {
            System.out.println("Error creating DocumentBuilder instance: " + e.getMessage());
        }
    }
}
