import java.awt.BasicStroke;

public class BasicStroke_1 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(2.0f);
        float lineWidth = stroke.getLineWidth();
        System.out.println("Line Width: " + lineWidth);
    }
}
