import javax.swing.JSlider;

public class JSlider_5 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        
        int maximum = slider.getMaximum();
        System.out.println("Maximum value of the slider: " + maximum);
    }
}
