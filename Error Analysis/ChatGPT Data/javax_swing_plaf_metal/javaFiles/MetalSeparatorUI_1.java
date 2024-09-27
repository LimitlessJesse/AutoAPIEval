import javax.swing.*;
import javax.swing.plaf.metal.MetalSeparatorUI;
import java.awt.*;

public class MetalSeparatorUI_1 {
    public static void main(String[] args) {
        JComponent separator = new JSeparator();
        Dimension preferredSize = MetalSeparatorUI.createUI(separator).getPreferredSize(separator);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
