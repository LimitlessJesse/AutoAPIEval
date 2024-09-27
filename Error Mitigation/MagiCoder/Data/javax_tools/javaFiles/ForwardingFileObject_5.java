import javax.tools.ForwardingFileObject;
import java.io.IOException;
import java.net.URI;

public class ForwardingFileObject_5 {
    public static void main(String[] args) {
        ForwardingFileObject fileObject = new ForwardingFileObject() {
            @Override
            public URI toUri() {
                return super.toUri();
            }
        };

        try {
            URI uri = fileObject.toUri();
            System.out.println(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
