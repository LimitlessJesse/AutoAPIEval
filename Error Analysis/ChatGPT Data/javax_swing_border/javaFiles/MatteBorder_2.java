import javax.swing.border.MatteBorder;
import java.awt.*;

public class MatteBorder_2 {
    public static void main(String[] args) {
        MatteBorder matteBorder = new MatteBorder(10, 10, 10, 10, Color.RED);
        Color matteColor = matteBorder.getMatteColor();
        System.out.println("Matte Color: " + matteColor);
    }
}
