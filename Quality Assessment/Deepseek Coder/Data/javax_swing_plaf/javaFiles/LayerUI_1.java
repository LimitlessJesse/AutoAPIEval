import javax.swing.*;
import javax.swing.plaf.LayerUI;

public class LayerUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");

        LayerUI layerUI = new LayerUI();
        layerUI.installUI(button);

        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
