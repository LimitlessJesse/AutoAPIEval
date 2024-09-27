import javax.swing.JSlider;
import javax.swing.SwingUtilities;

public class JSlider_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JSlider slider = new JSlider();
                slider.setMinorTickSpacing(10);
                System.out.println(slider.getMinorTickSpacing());
            }
        });
    }
}
