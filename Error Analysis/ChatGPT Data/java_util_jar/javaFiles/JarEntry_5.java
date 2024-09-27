import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.security.cert.Certificate;

public class JarEntry_5 {
    public static void main(String[] args) {
        try {
            JarFile jarFile = new JarFile("example.jar");
            Enumeration<JarEntry> entries = jarFile.entries();
            
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                Certificate[] certificates = entry.getCertificates();
                
                if (certificates != null) {
                    for (Certificate cert : certificates) {
                        System.out.println(cert);
                    }
                } else {
                    System.out.println("No certificates found for entry: " + entry.getName());
                }
            }
            
            jarFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
