import javax.swing.JSlider;
import javax.swing.SwingUtilities;

public class JSlider_1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JSlider slider = new JSlider();
                slider.setMajorTickSpacing(10);
                slider.setMinorTickSpacing(1);
                slider.setPaintTicks(true);
                slider.setPaintLabels(true);

                int majorTickSpacing = slider.getMajorTickSpacing();
                System.out.println("Major Tick Spacing: " + majorTickSpacing);
            }
        });
    }
}
