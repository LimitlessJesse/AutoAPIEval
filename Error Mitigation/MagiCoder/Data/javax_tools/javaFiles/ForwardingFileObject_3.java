import javax.tools.ForwardingFileObject;
import java.io.IOException;
import java.io.Reader;

public class ForwardingFileObject_3 {
    public static void main(String[] args) {
        ForwardingFileObject fileObject = new ForwardingFileObject() {
            @Override
            public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
                // Implementation of openReader method goes here
            }
        };
    }
}
