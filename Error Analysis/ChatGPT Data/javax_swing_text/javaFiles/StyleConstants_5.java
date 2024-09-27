import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;

public class StyleConstants_5 {
    public static void main(String[] args) {
        MutableAttributeSet attr = StyleConstants.getEmptySet();
        int size = 12;
        StyleConstants.setFontSize(attr, size);
        System.out.println("Font size set to: " + StyleConstants.getFontSize(attr));
    }
}
