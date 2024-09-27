import javax.swing.border.LineBorder;
import java.awt.Color;

public class LineBorder_2 {
    public static void main(String[] args) {
        LineBorder lineBorder = new LineBorder(Color.BLACK, 2);
        Color color = lineBorder.getLineColor();
        System.out.println("Border color: " + color);
    }
}
