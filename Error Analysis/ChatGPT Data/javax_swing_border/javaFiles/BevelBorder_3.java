import javax.swing.border.BevelBorder;
import java.awt.Color;

public class BevelBorder_3 {
    public static void main(String[] args) {
        BevelBorder border = new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.WHITE);
        Color shadowInnerColor = border.getShadowInnerColor();
        System.out.println("Shadow Inner Color: " + shadowInnerColor);
    }
}
