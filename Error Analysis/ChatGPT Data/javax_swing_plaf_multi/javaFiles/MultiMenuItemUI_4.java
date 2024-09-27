import javax.swing.*;
import javax.swing.plaf.multi.MultiMenuItemUI;
import java.awt.*;

public class MultiMenuItemUI_4 {
    public static void main(String[] args) {
        JComponent component = new JButton("Click me");
        Graphics graphics = component.getGraphics();

        MultiMenuItemUI multiMenuItemUI = new MultiMenuItemUI();
        multiMenuItemUI.update(graphics, component);
    }
}
