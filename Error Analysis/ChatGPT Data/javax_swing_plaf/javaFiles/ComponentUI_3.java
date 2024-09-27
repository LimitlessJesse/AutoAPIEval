import javax.swing.*;
import javax.swing.plaf.ComponentUI;

public class ComponentUI_3 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        ComponentUI ui = button.getUI();
        Dimension preferredSize = ui.getPreferredSize(button);
        System.out.println("Preferred size: " + preferredSize);
    }
}
