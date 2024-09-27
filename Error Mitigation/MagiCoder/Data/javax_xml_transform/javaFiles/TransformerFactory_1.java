import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class TransformerFactory_1 {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            System.out.println(factory);
        } catch (TransformerFactoryConfigurationError e) {
            e.printStackTrace();
        }
    }
}
