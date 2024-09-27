import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;

public class ComponentAdapter_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Component Resize Example");
        frame.setSize(300, 200);
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int newWidth = e.getComponent().getWidth();
                int newHeight = e.getComponent().getHeight();
                System.out.println("Component resized to: " + newWidth + "x" + newHeight);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
