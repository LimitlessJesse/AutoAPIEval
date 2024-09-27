import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.net.URI;

public class SimpleJavaFileObject_4 {
    public static void main(String[] args) {
        try {
            URI uri = URI.create("file:///path/to/your/file.java");
            SimpleJavaFileObject fileObject = new SimpleJavaFileObject(uri, StandardJavaFileManager.Kind.SOURCE);
            CharSequence content = fileObject.getCharContent(true);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
