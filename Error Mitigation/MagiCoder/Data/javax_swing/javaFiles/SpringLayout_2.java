import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class SpringLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Button");
        frame.add(button);

        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);

        layout.putConstraint(SpringLayout.WEST, button, 50, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, button, 50, SpringLayout.NORTH, frame);

        layout.addLayoutComponent("Button", button);

        frame.setVisible(true);
    }
}
