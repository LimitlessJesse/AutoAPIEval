import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;

public class ComponentAdapter_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Component Moved Example");
        frame.setSize(300, 300);
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("Component moved to: " + e.getComponent().getLocation());
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
