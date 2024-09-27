import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class EtchedBorder_7 {
    public static void main(String[] args) {
        EtchedBorder etchedBorder = new EtchedBorder();
        Color highlightColor = etchedBorder.getHighlightColor();
        System.out.println("Highlight Color: " + highlightColor);
    }
}
