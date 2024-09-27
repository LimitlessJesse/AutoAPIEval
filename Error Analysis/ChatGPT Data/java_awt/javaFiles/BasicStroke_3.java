import java.awt.BasicStroke;

public class BasicStroke_3 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        int lineJoin = stroke.getLineJoin();
        System.out.println("Line Join type: " + lineJoin);
    }
}
