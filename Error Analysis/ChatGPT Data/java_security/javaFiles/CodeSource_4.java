import java.security.CodeSource;
import java.net.URL;

public class CodeSource_4 {
    public static void main(String[] args) {
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        URL location = codeSource.getLocation();
        System.out.println("Location of the code source: " + location);
    }
}
