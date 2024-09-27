import javax.swing.text.StyleContext;
import java.util.Enumeration;

public class StyleContext_4 {
    public static void main(String[] args) {
        StyleContext styleContext = new StyleContext();
        Enumeration<?> styleNames = styleContext.getStyleNames();
        
        // Loop through and print out all style names
        while (styleNames.hasMoreElements()) {
            System.out.println(styleNames.nextElement());
        }
    }
}
