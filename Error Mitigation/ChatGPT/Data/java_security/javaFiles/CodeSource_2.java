import java.net.URL;
import java.security.CodeSource;

public class CodeSource_2 {
    public static void main(String[] args) {
        CodeSource codeSource = new CodeSource(new URL("https://example.com"), null);
        URL location = codeSource.getLocation();
        System.out.println("Location: " + location);
    }
}
