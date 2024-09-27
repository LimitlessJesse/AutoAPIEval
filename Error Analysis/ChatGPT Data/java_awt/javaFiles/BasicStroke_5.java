import java.awt.BasicStroke;

public class BasicStroke_5 {
    public static void main(String[] args) {
        BasicStroke basicStroke = new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 10.0f);
        float miterLimit = basicStroke.getMiterLimit();
        System.out.println("Miter Limit: " + miterLimit);
    }
}
