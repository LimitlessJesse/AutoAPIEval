import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleHyperlink;
import javax.accessibility.AccessibleRole;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AccessibleContext_3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("AccessibleContext Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                JLabel label = new JLabel("Hello, World!");
                JButton button = new JButton("Click me");

                panel.add(label);
                panel.add(button);

                frame.getContentPane().add(panel);
                frame.pack();
                frame.setVisible(true);

                AccessibleContext labelContext = label.getAccessibleContext();
                AccessibleContext buttonContext = button.getAccessibleContext();

                AccessibleContext panelContext = panel.getAccessibleContext();
                AccessibleContext frameContext = frame.getAccessibleContext();

                System.out.println("Label's parent: " + labelContext.getAccessibleParent());
                System.out.println("Button's parent: " + buttonContext.getAccessibleParent());
                System.out.println("Panel's parent: " + panelContext.getAccessibleParent());
                System.out.println("Frame's parent: " + frameContext.getAccessibleParent());
            }
        });
    }
}
