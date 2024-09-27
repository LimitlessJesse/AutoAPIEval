import javax.swing.JSlider;

public class JSlider_2 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setMaximum(100);
        System.out.println("Maximum value set to: " + slider.getMaximum());
    }
}
