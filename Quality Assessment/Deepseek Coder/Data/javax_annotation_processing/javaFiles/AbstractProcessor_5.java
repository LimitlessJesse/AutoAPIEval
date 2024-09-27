import javax.annotation.processing.*;
import javax.lang.model.*;
import javax.lang.model.element.*;
import java.util.*;

public class MyProcessor extends AbstractProcessor {
    private ProcessingEnvironment processingEnv;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        this.processingEnv = processingEnv;
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // Processing logic goes here
        return true;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return new HashSet<>(Arrays.asList("com.example.MyAnnotation"));
    }
}
