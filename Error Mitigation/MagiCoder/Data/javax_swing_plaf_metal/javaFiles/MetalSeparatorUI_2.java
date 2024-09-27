import javax.swing.*;
import javax.swing.plaf.metal.MetalSeparatorUI;
import java.awt.*;

public class MetalSeparatorUI_2 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        MetalSeparatorUI metalSeparatorUI = new MetalSeparatorUI();
        Dimension preferredSize = metalSeparatorUI.getPreferredSize(separator);
        System.out.println("Preferred size: " + preferredSize);
    }
}
