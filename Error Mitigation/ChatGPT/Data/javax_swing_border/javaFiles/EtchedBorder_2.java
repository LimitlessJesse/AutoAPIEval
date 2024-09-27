import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class EtchedBorder_2 {
    public static void main(String[] args) {
        EtchedBorder etchedBorder = new EtchedBorder();
        Color highlightColor = etchedBorder.getHighlightColor();
        if (highlightColor != null) {
            System.out.println("Highlight Color: " + highlightColor);
        } else {
            System.out.println("No highlight color specified.");
        }
    }
}
