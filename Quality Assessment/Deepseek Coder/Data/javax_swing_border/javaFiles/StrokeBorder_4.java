import javax.swing.border.StrokeBorder;
import java.awt.*;

public class StrokeBorder_4 {
    public static void main(String[] args) {
        StrokeBorder strokeBorder = new StrokeBorder(new BasicStroke(5), Color.RED, Color.BLACK, StrokeBorder.RAISED, true, true);
        Paint paint = strokeBorder.getPaint();
        System.out.println(paint);
    }
}
