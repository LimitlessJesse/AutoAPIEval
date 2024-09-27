import javax.xml.validation.SchemaFactoryLoader;
import javax.xml.validation.SchemaFactory;

public class SchemaFactoryLoader_1 {
    public static void main(String[] args) {
        SchemaFactoryLoader loader = SchemaFactoryLoader.newInstance();
        SchemaFactory factory = loader.newFactory("http://www.w3.org/2001/XMLSchema");
        System.out.println("SchemaFactory created: " + factory);
    }
}
