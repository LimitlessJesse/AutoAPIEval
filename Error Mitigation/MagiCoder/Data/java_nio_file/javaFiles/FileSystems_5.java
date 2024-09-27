import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Map;

public class FileSystems_5 {
    public static void main(String[] args) {
        try {
            URI uri = URI.create("file:///C:/Users/user/Desktop");
            Map<String,?> env = new java.util.HashMap<>();
            ClassLoader loader = FileSystems_5.class.getClassLoader();
            FileSystem fs = FileSystems.newFileSystem(uri, env, loader);
            System.out.println(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
