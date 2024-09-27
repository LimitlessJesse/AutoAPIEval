import javax.annotation.processing.AbstractProcessor;
import javax.lang.model.SourceVersion;
import java.util.Set;

public class AbstractProcessor_2 {
    public static void main(String[] args) {
        AbstractProcessor processor = new AbstractProcessor() {
            // Implement the abstract methods
        };

        SourceVersion sourceVersion = processor.getSupportedSourceVersion();
        System.out.println("Supported Source Version: " + sourceVersion);
    }
}
