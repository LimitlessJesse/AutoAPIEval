import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class Validator_1 {

    public static void main(String[] args) {
        String xmlString = "<root>Hello World!</root>";
        String xsdString = "<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'><xs:element name='root' type='xs:string'/></xs:schema>";

        Source xmlSource = new StreamSource(new java.io.StringReader(xmlString));
        Source xsdSource = new StreamSource(new java.io.StringReader(xsdString));

        validate(xmlSource, xsdSource);
    }

    public static void validate(Source xmlSource, Source xsdSource) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(xsdSource);
            Validator validator = schema.newValidator();
            validator.validate(xmlSource);
            System.out.println("Validation successful");
        } catch (Exception e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
