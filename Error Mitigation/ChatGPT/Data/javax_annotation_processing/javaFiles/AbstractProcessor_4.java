import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;

public class MyAnnotationProcessor extends AbstractProcessor {

    private ProcessingEnvironment processingEnv;

    @Override
    public void init(ProcessingEnvironment processingEnv) {
        if (this.processingEnv != null) {
            throw new IllegalStateException("init method has already been called");
        }
        this.processingEnv = processingEnv;
    }

    public static void main(String[] args) {
        // Instantiate and use the annotation processor
        MyAnnotationProcessor processor = new MyAnnotationProcessor();
        processor.init(processingEnv);
    }
}
