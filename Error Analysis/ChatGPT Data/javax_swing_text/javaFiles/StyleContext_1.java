import javax.swing.text.Style;
import javax.swing.text.StyleContext;

public class StyleContext_1 {
    public static void main(String[] args) {
        StyleContext context = new StyleContext();
        Style parent = context.getStyle(StyleContext.DEFAULT_STYLE);
        Style customStyle = context.addStyle("CustomStyle", parent);
    }
}
