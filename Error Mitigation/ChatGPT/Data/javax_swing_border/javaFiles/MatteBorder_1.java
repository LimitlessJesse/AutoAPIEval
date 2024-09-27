import javax.swing.border.MatteBorder;
import java.awt.Color;

public class MatteBorder_1 {
    public static void main(String[] args) {
        MatteBorder matteBorder = new MatteBorder(1, 1, 1, 1, Color.RED);
        Color matteColor = matteBorder.getMatteColor();
        System.out.println("Matte Color: " + matteColor);
    }
}
