import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;

public class StyleConstants_3 {
    public static void main(String[] args) {
        MutableAttributeSet attr = StyleConstants.getEmptySet();
        setUnderline(attr, true);
    }

    public static void setUnderline(MutableAttributeSet attr, boolean underline) {
        StyleConstants.setUnderline(attr, underline);
    }
}
