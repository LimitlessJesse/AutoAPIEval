import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class SimpleAttributeSet_2 {
    public static void main(String[] args) {
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setFontFamily(attributeSet, "Arial");
        StyleConstants.setFontSize(attributeSet, 12);

        Object fontFamily = attributeSet.getAttribute(StyleConstants.FontFamily);
        Object fontSize = attributeSet.getAttribute(StyleConstants.FontSize);

        System.out.println("Font Family: " + fontFamily);
        System.out.println("Font Size: " + fontSize);
    }
}
