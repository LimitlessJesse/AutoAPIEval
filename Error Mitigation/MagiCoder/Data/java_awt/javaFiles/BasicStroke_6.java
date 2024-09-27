import java.awt.BasicStroke;

public class BasicStroke_6 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{1.0f}, 0);
        float miterLimit = stroke.getMiterLimit();
        System.out.println("Miter limit: " + miterLimit);
    }
}
