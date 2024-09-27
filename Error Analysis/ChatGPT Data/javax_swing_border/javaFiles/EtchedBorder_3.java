import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class EtchedBorder_3 {
    public static void main(String[] args) {
        EtchedBorder etched = new EtchedBorder();
        Color shadowColor = etched.getShadowColor();
        System.out.println("Shadow Color: " + shadowColor);
    }
}
