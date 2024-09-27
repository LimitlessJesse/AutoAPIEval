import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class SpringLayout_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        layout.putConstraint(SpringLayout.NORTH, button1, 50, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button1, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.SOUTH, button2, -50, SpringLayout.SOUTH, panel);
        layout.putConstraint(SpringLayout.EAST, button2, -50, SpringLayout.EAST, panel);

        panel.add(button1);
        panel.add(button2);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        layout.minimumLayoutSize(panel);
    }
}
