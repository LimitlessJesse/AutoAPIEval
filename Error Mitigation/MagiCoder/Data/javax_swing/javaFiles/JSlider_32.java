import javax.swing.JSlider;

public class JSlider_32 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setMaximum(100);
        int max = slider.getMaximum();
        System.out.println("Maximum value: " + max);
    }
}
