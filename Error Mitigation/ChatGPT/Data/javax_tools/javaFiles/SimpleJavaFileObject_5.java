import javax.tools.SimpleJavaFileObject;
import java.net.URI;

public class SimpleJavaFileObject_5 {
    public static void main(String[] args) {
        SimpleJavaFileObject fileObject = new SimpleJavaFileObject(URI.create("file:///path/to/file"), SimpleJavaFileObject.Kind.SOURCE);
        URI uri = fileObject.toUri();
        System.out.println("URI: " + uri);
    }
}
