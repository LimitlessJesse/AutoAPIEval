import javax.swing.plaf.ComponentUI;
import javax.swing.JButton;

public class ComponentUI_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        ComponentUI ui = button.getUI();
        boolean contains = ui.contains(button, 10, 10);
        System.out.println("Contains (10, 10): " + contains);
    }
}
