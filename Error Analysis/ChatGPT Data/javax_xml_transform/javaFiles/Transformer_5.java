import javax.xml.transform.Transformer;
import java.util.Properties;
import javax.xml.transform.OutputKeys;

public class Transformer_5 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty(OutputKeys.INDENT, "yes");
        
        Transformer transformer = // obtain Transformer instance
        transformer.setOutputProperties(prop);
        
        // continue with the rest of the code
    }
}
