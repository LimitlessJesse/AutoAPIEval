import javax.swing.text.View;
import javax.swing.text.LabelView;
import java.awt.Color;

public class LabelView_4 {
    public static void main(String[] args) {
        LabelView labelView = new LabelView(null);
        Color foregroundColor = labelView.getForeground();
        System.out.println("Foreground color: " + foregroundColor);
    }
}
