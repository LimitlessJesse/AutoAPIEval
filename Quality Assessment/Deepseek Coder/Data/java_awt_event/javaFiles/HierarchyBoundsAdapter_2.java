import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HierarchyBoundsAdapter_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HierarchyBoundsAdapter_2 Frame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click the button to update the label");
        frame.add(label);

        JButton button = new JButton("Click me");
        button.addActionListener(e -> label.setText("Button clicked"));
        frame.add(button);

        frame.addHierarchyListener(new HierarchyBoundsAdapter() {
            @Override
            public void ancestorResized(HierarchyEvent e) {
                System.out.println("Frame resized");
            }
        });

        frame.setVisible(true);
    }
}
