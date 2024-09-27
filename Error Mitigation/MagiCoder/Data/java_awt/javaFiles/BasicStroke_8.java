import java.awt.BasicStroke;

public class BasicStroke_8 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f}, 0.0f);
        float dashPhase = stroke.getDashPhase();
        System.out.println("Dash Phase: " + dashPhase);
    }
}
