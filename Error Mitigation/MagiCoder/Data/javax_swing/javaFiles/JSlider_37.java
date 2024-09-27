import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class JSlider_37 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        int orientation = slider.getOrientation();
        System.out.println("Orientation: " + (orientation == SwingConstants.VERTICAL? "Vertical" : "Horizontal"));
    }
}
