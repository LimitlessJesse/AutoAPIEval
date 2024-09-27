import javax.swing.JSlider;
import javax.swing.BoundedRangeModel;

public class JSlider_38 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setValue(50);
        int value = slider.getValue();
        System.out.println("The current value of the slider is: " + value);
    }
}
