import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;
import java.util.Set;

public class AbstractProcessor_4 {
    public static void main(String[] args) {
        AbstractProcessor processor = new AbstractProcessor() {
            @Override
            public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
                // Your processing logic here
                return false;
            }
        };

        // You can call the process method like this
        processor.process(null, null);
    }
}
