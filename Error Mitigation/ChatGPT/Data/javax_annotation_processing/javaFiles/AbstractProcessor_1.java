import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import java.util.Set;

public class AbstractProcessor_1 {
    public static void main(String[] args) {
        MyAnnotationProcessor processor = new MyAnnotationProcessor();
        Set<String> supportedAnnotationTypes = processor.getSupportedAnnotationTypes();
        System.out.println("Supported Annotation Types: " + supportedAnnotationTypes);
    }

    static class MyAnnotationProcessor extends AbstractProcessor {
        @Override
        public Set<String> getSupportedAnnotationTypes() {
            return Set.of("MyAnnotation1", "MyAnnotation2");
        }
    }
}
