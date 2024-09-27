import javax.swing.*;
import javax.swing.plaf.LayerUI;

public class LayerUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Get the LayerUI of the button
        LayerUI layerUI = button.getUI();

        // Uninstall the LayerUI
        layerUI.uninstallUI(button);

        // Now, the button will use the default UI delegate
    }
}
