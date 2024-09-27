import javax.swing.*;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import java.awt.*;

public class MetalPopupMenuSeparatorUI_2 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        MetalPopupMenuSeparatorUI separatorUI = new MetalPopupMenuSeparatorUI();
        Dimension preferredSize = separatorUI.getPreferredSize(button);
        System.out.println("Preferred size: " + preferredSize);
    }
}
