import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Schema;

import javax.xml.XMLConstants;

public class SchemaFactory_1 {
    public static void main(String[] args) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema();
            System.out.println("Schema created successfully");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
