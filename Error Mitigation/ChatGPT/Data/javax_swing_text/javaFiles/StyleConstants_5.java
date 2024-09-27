import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;

public class StyleConstants_5 {
    public static void main(String[] args) {
        MutableAttributeSet attr = StyleConstants.getEmptyMutableAttributeSet();
        setFontSize(attr, 12);
    }

    public static void setFontSize(MutableAttributeSet attr, int size) {
        StyleConstants.setFontSize(attr, size);
    }
}
