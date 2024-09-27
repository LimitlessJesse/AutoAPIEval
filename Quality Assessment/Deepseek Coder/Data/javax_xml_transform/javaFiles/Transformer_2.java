import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Transformer_2 {
    public static void main(String[] args) {
        try {
            // Create a TransformerFactory
            TransformerFactory factory = TransformerFactory.newInstance();

            // Use the TransformerFactory to create a Transformer
            Transformer transformer = factory.newTransformer();

            // Specify the source XML document
            Source source = new StreamSource(new File("source.xml"));

            // Specify the target XML document
            Result result = new StreamResult(new File("target.xml"));

            // Use the Transformer to transform the source XML document to the target XML document
            transformer.transform(source, result);

            System.out.println("Transformation completed successfully.");
        } catch (TransformerException e) {
            System.out.println("An error occurred during transformation: " + e.getMessage());
        }
    }
}
