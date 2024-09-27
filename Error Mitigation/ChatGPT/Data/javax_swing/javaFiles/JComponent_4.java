import javax.swing.JComponent;
import java.awt.Dimension;

public class JComponent_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            // Implementing setPreferredSize method
            public void setPreferredSize(Dimension preferredSize) {
                if (preferredSize == null) {
                    // UI will be asked for the preferred size
                } else {
                    // Set the preferred size
                    super.setPreferredSize(preferredSize);
                }
            }
        };

        // Setting preferred size
        Dimension newPreferredSize = new Dimension(200, 100);
        component.setPreferredSize(newPreferredSize);
    }
}
