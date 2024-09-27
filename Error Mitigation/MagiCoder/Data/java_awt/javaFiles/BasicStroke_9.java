import java.awt.BasicStroke;

public class BasicStroke_9 {
    public static void main(String[] args) {
        BasicStroke stroke1 = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{1.0f, 2.0f}, 0);
        BasicStroke stroke2 = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{1.0f, 2.0f}, 0);
        BasicStroke stroke3 = new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{1.0f, 2.0f}, 0);

        System.out.println(stroke1.equals(stroke2)); // true
        System.out.println(stroke1.equals(stroke3)); // false
    }
}
