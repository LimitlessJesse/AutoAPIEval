import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class SchemaFactory_2 {
    public static void main(String[] args) {
        try {
            // Create a SchemaFactory capable of understanding WXS schemas
            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

            // Load a WXS schema, represented by a Source
            Source schemaFile = new StreamSource("schema.xsd");

            // Compile the schema
            Schema schema = factory.newSchema(schemaFile);

            // Create a Validator instance, which can be used to validate an instance document
            Validator validator = schema.newValidator();

            // Load the instance document
            Source instanceFile = new StreamSource("instance.xml");

            // Validate the DOM tree
            validator.validate(instanceFile);

            System.out.println("The instance document is valid");
        } catch (Exception e) {
            System.out.println("The instance document is not valid");
            e.printStackTrace();
        }
    }
}
