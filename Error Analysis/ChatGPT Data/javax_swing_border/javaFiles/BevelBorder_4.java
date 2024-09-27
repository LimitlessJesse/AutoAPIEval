import javax.swing.border.BevelBorder;
import java.awt.Color;

public class BevelBorder_4 {
    public static void main(String[] args) {
        BevelBorder bevelBorder = new BevelBorder(BevelBorder.RAISED, Color.RED, Color.BLUE);
        Color highlightInnerColor = bevelBorder.getHighlightInnerColor();
        System.out.println("Highlight inner color: " + highlightInnerColor);
    }
}
