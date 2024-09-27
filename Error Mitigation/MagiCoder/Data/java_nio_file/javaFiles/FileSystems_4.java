import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.HashMap;
import java.util.Map;

public class FileSystems_4 {
    public static void main(String[] args) {
        try {
            Map<String, String> env = new HashMap<>();
            env.put("capacity", "16G");
            env.put("blockSize", "4k");
            FileSystem fs = FileSystems.newFileSystem(URI.create("memory:///?name=logfs"), env);
            System.out.println(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
