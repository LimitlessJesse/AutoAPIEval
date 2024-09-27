import java.awt.BasicStroke;

public class BasicStroke_4 {
    public static void main(String[] args) {
        BasicStroke basicStroke = new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
        int lineJoin = basicStroke.getLineJoin();
        System.out.println("Line Join Style: " + lineJoin);
    }
}
