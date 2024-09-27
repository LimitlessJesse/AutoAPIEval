import java.awt.BasicStroke;

public class BasicStroke_1 {
    public static void main(String[] args) {
        BasicStroke basicStroke = new BasicStroke(2.0f);
        float lineWidth = basicStroke.getLineWidth();
        System.out.println("Line width: " + lineWidth);
    }
}
