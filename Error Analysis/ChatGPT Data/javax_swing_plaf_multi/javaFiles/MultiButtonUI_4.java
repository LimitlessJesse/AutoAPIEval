import javax.swing.*;
import javax.swing.plaf.multi.MultiButtonUI;

public class MultiButtonUI_4 {
    public static void main(String[] args) {
        MultiButtonUI multiButtonUI = new MultiButtonUI();
        JComponent component = new JButton("Click me");
        System.out.println(multiButtonUI.getPreferredSize(component));
    }
}
