import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

public class AbstractProcessor_3 {
    public static void main(String[] args) {
        AbstractProcessor processor = new AbstractProcessor() {
            @Override
            public SourceVersion getSupportedSourceVersion() {
                return super.getSupportedSourceVersion();
            }
        };

        SourceVersion sourceVersion = processor.getSupportedSourceVersion();
        System.out.println(sourceVersion);
    }
}
