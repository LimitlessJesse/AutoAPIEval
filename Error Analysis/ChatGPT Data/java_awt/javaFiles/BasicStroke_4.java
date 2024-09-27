import java.awt.BasicStroke;

public class BasicStroke_4 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{5.0f, 2.0f}, 0.0f);
        float[] dashArray = stroke.getDashArray();
        
        System.out.print("Dash Array: [");
        for (int i = 0; i < dashArray.length; i++) {
            System.out.print(dashArray[i]);
            if (i < dashArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
