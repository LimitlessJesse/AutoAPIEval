import java.awt.BasicStroke;

public class BasicStroke_10 {
    public static void main(String[] args) {
        BasicStroke stroke = new BasicStroke(1.0f);
        int hashCode = stroke.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
