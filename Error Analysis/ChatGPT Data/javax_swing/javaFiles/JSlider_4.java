import javax.swing.JSlider;

public class JSlider_4 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setMinimum(0);
        int min = slider.getMinimum();
        System.out.println("Minimum value of the slider: " + min);
    }
}
