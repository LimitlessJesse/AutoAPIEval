import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class Transformer_1 {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            
            // Setting an output property
            transformer.setOutputProperty("encoding", "UTF-8");
            
            // Additional code for transforming XML can be added here
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
