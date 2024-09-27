import java.security.CodeSource;
import java.net.URL;

public class CodeSource_1 {
    public static void main(String[] args) {
        CodeSource codeSource = CodeSource_1.class.getProtectionDomain().getCodeSource();
        if (codeSource!= null) {
            URL location = codeSource.getLocation();
            System.out.println(location);
        }
    }
}
