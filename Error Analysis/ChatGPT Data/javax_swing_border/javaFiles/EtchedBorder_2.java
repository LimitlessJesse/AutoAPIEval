import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class EtchedBorder_2 {
    public static void main(String[] args) {
        Color highlightColor = new EtchedBorder().getHighlightColor();
        System.out.println("Highlight Color: " + highlightColor);
    }
}
