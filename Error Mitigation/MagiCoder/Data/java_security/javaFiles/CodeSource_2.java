import java.net.URL;
import java.security.CodeSource;

public class CodeSource_2 {
    public static void main(String[] args) {
        try {
            CodeSource codeSource = CodeSource_2.class.getProtectionDomain().getCodeSource();
            URL location = codeSource.getLocation();
            System.out.println("Location: " + location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
