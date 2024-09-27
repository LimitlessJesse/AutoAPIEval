import javax.xml.validation.Validator;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Schema;
import org.xml.sax.SAXException;
import java.io.IOException;

public class Validator_3 {
    public static void main(String[] args) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            Schema schema = factory.newSchema();
            Validator validator = schema.newValidator();

            validator.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
            validator.setProperty("http://java.sun.com/xml/jaxp/properties/schemaSource", "schema.xsd");

        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
