import javax.swing.JSlider;

public class JSlider_7 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setMinimum(0);
        slider.setMaximum(100);
        slider.setValue(50);

        int minValue = slider.getMinimum();
        System.out.println("Minimum value: " + minValue);
    }
}
