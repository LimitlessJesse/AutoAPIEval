import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class SimpleAttributeSet_5 {
    public static void main(String[] args) {
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setFontFamily(attributeSet, "Arial");
        StyleConstants.setFontSize(attributeSet, 12);
        System.out.println(attributeSet);

        attributeSet.removeAttribute(StyleConstants.FontFamily);
        System.out.println(attributeSet);
    }
}
