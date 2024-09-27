import javax.swing.plaf.multi.MultiViewportUI;
import javax.swing.JComponent;
import java.awt.Graphics;

public class MultiViewportUI_2 {
    public static void main(String[] args) {
        // Initialize a JComponent
        JComponent component = new JComponent() {
            @Override
            public void paint(Graphics g) {
                // Call the void paint method from MultiViewportUI
                MultiViewportUI ui = new MultiViewportUI();
                ui.paint(g, this);
            }
        };

        // Invoke the paint method of the JComponent to trigger the paint method from MultiViewportUI
        component.paintComponent(component.getGraphics());
    }
}
