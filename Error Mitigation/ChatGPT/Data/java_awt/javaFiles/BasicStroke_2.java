import java.awt.BasicStroke;

public class BasicStroke_2 {
    public static void main(String[] args) {
        BasicStroke basicStroke = new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        int endCapStyle = basicStroke.getEndCap();
        System.out.println("End Cap Style: " + endCapStyle);
    }
}
