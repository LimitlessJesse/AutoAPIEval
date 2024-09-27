import javax.annotation.processing.AbstractProcessor;
import java.util.Set;

public class AbstractProcessor_2 {
    public static void main(String[] args) {
        ExampleProcessor processor = new ExampleProcessor();
        Set<String> supportedOptions = processor.getSupportedOptions();
        System.out.println(supportedOptions);
    }

    static class ExampleProcessor extends AbstractProcessor {
        @Override
        public Set<String> getSupportedOptions() {
            return super.getSupportedOptions();
        }
    }
}
