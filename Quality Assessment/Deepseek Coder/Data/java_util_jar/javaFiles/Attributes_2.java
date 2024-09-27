import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.io.File;
import java.io.IOException;

public class Attributes_2 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile(new File("path_to_your_jar_file.jar"));
            JarEntry jarEntry = jarFile.getJarEntry("your_jar_entry");
            Manifest manifest = jarFile.getManifest();
            Attributes attributes = manifest.getAttributes_2Attributes();
            Object value = attributes.get(new Attributes.Name("your_attribute_name"));
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
