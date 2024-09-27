import javax.swing.JSlider;

public class JSlider_1 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setMinimum(0);
        System.out.println("Minimum value set to: " + slider.getMinimum());
    }
}
