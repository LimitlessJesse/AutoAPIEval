import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.Color;

public class StyleConstants_3 {
    public static void main(String[] args) {
        MutableAttributeSet attr = StyleConstants.getEmptySet();
        Color color = Color.RED;
        
        StyleConstants.setForeground(attr, color);
        
        System.out.println("Foreground color set to: " + attr.getAttribute(StyleConstants.Foreground));
    }
}
