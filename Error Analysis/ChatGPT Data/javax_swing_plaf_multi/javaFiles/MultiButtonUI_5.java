import javax.swing.plaf.multi.MultiButtonUI;
import javax.swing.*;

public class MultiButtonUI_5 {
    public static void main(String[] args) {
        MultiButtonUI multiButtonUI = new MultiButtonUI();
        JComponent component = new JButton();
        multiButtonUI.installUI(component);
        System.out.println("UI installed successfully");
    }
}
