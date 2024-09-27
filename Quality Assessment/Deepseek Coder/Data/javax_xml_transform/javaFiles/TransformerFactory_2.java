import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class TransformerFactory_2 {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            System.out.println(transformer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
