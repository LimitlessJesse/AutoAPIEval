import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HierarchyBoundsAdapter_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hierarchy Event Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        JLabel label = new JLabel("Hello, World!");

        button.addActionListener(e -> label.setText("Button clicked"));

        frame.getContentPane().add(button);
        frame.getContentPane().add(label);

        frame.setVisible(true);

        frame.addHierarchyListener(new HierarchyBoundsAdapter() {
            @Override
            public void ancestorMoved(HierarchyEvent e) {
                System.out.println("Ancestor moved: " + e.getChangedParent());
            }
        });
    }
}
