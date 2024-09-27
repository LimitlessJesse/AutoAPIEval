import javax.swing.*;
import javax.swing.plaf.metal.MetalMenuBarUI;

public class MetalMenuBarUI_1 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        MetalMenuBarUI metalUI = new MetalMenuBarUI();
        metalUI.installUI(menuBar);
    }
}
