import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Set;

@SupportedAnnotationTypes("*")
public class MyAnnotationProcessor extends AbstractProcessor {
    
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return super.getSupportedAnnotationTypes();
    }
    
    public static void main(String[] args) {
        // Create an instance of the MyAnnotationProcessor
        MyAnnotationProcessor processor = new MyAnnotationProcessor();
        
        // Get the supported annotation types
        Set<String> supportedAnnotationTypes = processor.getSupportedAnnotationTypes();
        
        // Print out the supported annotation types
        System.out.println("Supported Annotation Types: " + supportedAnnotationTypes);
    }
}
