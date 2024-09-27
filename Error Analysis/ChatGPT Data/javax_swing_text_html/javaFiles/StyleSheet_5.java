import javax.swing.text.html.StyleSheet;
import java.net.URL;

public class StyleSheet_5 {
    public static void main(String[] args) {
        StyleSheet styleSheet = new StyleSheet();
        URL baseUrl = new URL("https://example.com");
        styleSheet.setBase(baseUrl);
    }
}
