import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class ComponentUI_1 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        ComponentUI ui = new BasicButtonUI();
        ui.installUI(button);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
