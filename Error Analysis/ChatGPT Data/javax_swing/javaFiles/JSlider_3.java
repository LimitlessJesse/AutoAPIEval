import javax.swing.JSlider;

public class JSlider_3 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setMaximum(100);
        slider.setMinimum(0);

        slider.setValue(50);
        System.out.println("Slider value: " + slider.getValue());
    }
}
