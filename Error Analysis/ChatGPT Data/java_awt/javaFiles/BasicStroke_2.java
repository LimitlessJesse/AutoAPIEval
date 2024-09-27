import java.awt.BasicStroke;

public class BasicStroke_2 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        int endCap = stroke.getEndCap();
        System.out.println("End Cap style: " + endCap);
    }
}
