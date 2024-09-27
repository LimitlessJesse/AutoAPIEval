import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Schema;

public class SchemaFactory_1 {
    public static void main(String[] args) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            Schema schema = factory.newSchema(new java.io.File("schema.xsd"));
            // Use the schema for validation
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
