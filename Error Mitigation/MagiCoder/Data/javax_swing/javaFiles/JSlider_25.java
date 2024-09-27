import javax.swing.JSlider;

public class JSlider_25 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        int majorTickSpacing = slider.getMajorTickSpacing();
        System.out.println("Major tick spacing: " + majorTickSpacing);
    }
}
