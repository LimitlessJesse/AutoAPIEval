import javax.annotation.processing.AbstractProcessor;
import javax.lang.model.SourceVersion;

public class AbstractProcessor_3 {
    public static void main(String[] args) {
        MyAnnotationProcessor processor = new MyAnnotationProcessor();
        SourceVersion sourceVersion = processor.getSupportedSourceVersion();
        System.out.println("Supported Source Version: " + sourceVersion);
    }

    static class MyAnnotationProcessor extends AbstractProcessor {
        @Override
        public SourceVersion getSupportedSourceVersion() {
            return SourceVersion.RELEASE_8;
        }
    }
}
