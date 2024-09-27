import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class LineBorder_2 {
    public static void main(String[] args) {
        LineBorder lineBorder = new LineBorder(Color.BLACK);
        Color color = lineBorder.getLineColor();
        System.out.println("Line color: " + color);
    }
}
