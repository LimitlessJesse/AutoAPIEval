import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class EtchedBorder_9 {
    public static void main(String[] args) {
        EtchedBorder etchedBorder = new EtchedBorder();
        Color shadowColor = etchedBorder.getShadowColor();
        System.out.println("Shadow Color: " + shadowColor);
    }
}
