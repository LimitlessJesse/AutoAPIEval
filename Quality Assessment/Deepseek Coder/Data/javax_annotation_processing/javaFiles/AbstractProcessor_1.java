import javax.annotation.processing.*;
import javax.lang.model.*;
import javax.lang.model.element.*;
import java.util.*;

public class MyProcessor extends AbstractProcessor {

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(annotations.iterator().next())) {
            System.out.println("Processing element: " + element.getSimpleName());
        }
        return true;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return new HashSet<>(Arrays.asList("com.example.MyAnnotation"));
    }
}

public class AbstractProcessor_1 {
    public static void main(String[] args) {
        // This is a dummy usage of MyProcessor. In a real-world scenario, you would use it with a Java compiler or annotation processor tool.
        MyProcessor processor = new MyProcessor();
        RoundEnvironment roundEnv = null; // This would typically be obtained from a Java compiler or annotation processor tool.
        Set<? extends TypeElement> annotations = null; // This would typically be obtained from a Java compiler or annotation processor tool.
        processor.process(annotations, roundEnv);
    }
}
