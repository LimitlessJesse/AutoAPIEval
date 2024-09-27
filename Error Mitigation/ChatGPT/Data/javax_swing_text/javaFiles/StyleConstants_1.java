import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;

public class StyleConstants_1 {
    public static void main(String[] args) {
        MutableAttributeSet attr = StyleConstants.getEmptySet();
        setBold(attr, true);
    }

    public static void setBold(MutableAttributeSet attr, boolean bold) {
        StyleConstants.setBold(attr, bold);
    }
}
