import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.net.URL;
import javax.xml.XMLConstants;
import javax.xml.validation.Schema;

public class SchemaFactory_3 {
    public static void main(String[] args) {
        try {
            URL schemaURL = new URL("http://www.w3.org/2001/XMLSchema.xsd");
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(schemaURL);
            System.out.println("Schema created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
