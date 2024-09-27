import javax.swing.JLayer;
import javax.swing.border.Border;

public class JLayer_5 {
    public static void main(String[] args) {
        JLayer jLayer = new JLayer();
        Border border = null;
        try {
            jLayer.setBorder(border);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Borders are not supported on a JLayer");
        }
    }
}
