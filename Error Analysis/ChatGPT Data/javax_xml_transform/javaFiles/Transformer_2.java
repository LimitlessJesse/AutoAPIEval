import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class Transformer_2 {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();

            // Provide the XML source file
            Source xmlSource = new StreamSource("input.xml");

            // Provide the output target file
            Result outputTarget = new StreamResult("output.xml");

            transformer.transform(xmlSource, outputTarget);

            System.out.println("Transformation successful");
        } catch (Exception e) {
            System.err.println("Error when transforming XML: " + e.getMessage());
        }
    }
}
