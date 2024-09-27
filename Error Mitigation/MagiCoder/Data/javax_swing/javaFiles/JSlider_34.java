import javax.swing.JSlider;

public class JSlider_34 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setMinorTickSpacing(10);
        int minorTickSpacing = slider.getMinorTickSpacing();
        System.out.println("Minor tick spacing: " + minorTickSpacing);
    }
}
