import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

public class JarInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.jar");
            JarInputStream jis = new JarInputStream(fis);
            
            Manifest manifest = jis.getManifest();
            
            if (manifest != null) {
                System.out.println("Manifest found:");
                System.out.println(manifest);
            } else {
                System.out.println("No manifest found.");
            }
            
            jis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
