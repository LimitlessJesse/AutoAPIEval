import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;

public class StyleConstants_2 {
    public static void main(String[] args) {
        MutableAttributeSet attr = StyleConstants.getEmptySet();
        setItalic(attr, true);
    }

    public static void setItalic(MutableAttributeSet attr, boolean italic) {
        StyleConstants.setItalic(attr, italic);
    }
}
