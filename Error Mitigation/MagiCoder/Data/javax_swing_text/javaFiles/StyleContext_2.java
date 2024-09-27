import javax.swing.text.StyleContext;
import javax.swing.text.Style;

public class StyleContext_2 {
    public static void main(String[] args) {
        StyleContext context = new StyleContext();
        Style style = context.getStyle(StyleContext.DEFAULT_STYLE);
        System.out.println(style);
    }
}
