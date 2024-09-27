import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

public class SchemaFactory_1 {
    public static void main(String[] args) {
        SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        Schema schema = null;
        try {
            schema = factory.newSchema(schema);
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
