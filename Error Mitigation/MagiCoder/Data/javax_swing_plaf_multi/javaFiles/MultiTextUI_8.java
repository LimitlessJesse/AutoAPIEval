import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTextUI;
import java.awt.Graphics;

public class MultiTextUI_8 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            private MultiTextUI ui = new MultiTextUI();

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                ui.update(g, this);
            }
        };

        // Now you can add the component to a container and it will be painted with the UI
    }
}
