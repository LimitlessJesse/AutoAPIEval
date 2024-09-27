import java.net.URI;
import javax.tools.ForwardingFileObject;

public class ForwardingFileObject_4 {
    public static void main(String[] args) {
        ForwardingFileObject fileObject = new ForwardingFileObject() {
            @Override
            public URI toUri() {
                return URI.create("file:///path/to/file.java");
            }
        };

        URI uri = fileObject.toUri();
        System.out.println(uri);
    }
}
