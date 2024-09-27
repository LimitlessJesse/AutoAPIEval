import javax.swing.*;
import javax.swing.plaf.metal.MetalRadioButtonUI;
import java.awt.*;

public class MetalRadioButtonUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JRadioButton button = new JRadioButton("Radio Button");
        MetalRadioButtonUI ui = new MetalRadioButtonUI();
        ui.paint(frame.getGraphics(), button);
    }
}
