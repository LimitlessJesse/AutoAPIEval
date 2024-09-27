import javax.swing.border.StrokeBorder;
import java.awt.Color;
import java.awt.Paint;

public class StrokeBorder_3 {
    public static void main(String[] args) {
        StrokeBorder strokeBorder = new StrokeBorder(Color.BLACK);
        Paint paint = strokeBorder.getPaint();
        System.out.println("Paint object: " + paint);
    }
}
