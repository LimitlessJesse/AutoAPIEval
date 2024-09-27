import javax.swing.border.LineBorder;
import java.awt.*;

public class LineBorder_1 {
    public static void main(String[] args) {
        LineBorder border = new LineBorder(Color.BLACK, 5);
        System.out.println(border.getThickness());
    }
}
