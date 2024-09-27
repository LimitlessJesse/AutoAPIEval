import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;

public class StyleConstants_4 {
    public static void main(String[] args) {
        MutableAttributeSet attr = StyleConstants.getEmptySet();
        String family = "Arial";
        
        StyleConstants.setFontFamily(attr, family);
        
        System.out.println("Font family set to: " + StyleConstants.getFontFamily(attr));
    }
}
