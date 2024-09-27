import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class LineBorder_5 {
    public static void main(String[] args) {
        LineBorder lineBorder = new LineBorder(Color.BLACK, 2, true);
        Border border = lineBorder.getBorder();
        System.out.println(border.isBorderOpaque());
    }
}
