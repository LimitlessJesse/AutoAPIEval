import javax.swing.plaf.metal.MetalSliderUI;
import javax.swing.*;
import java.awt.*;

public class MetalSliderUI_3 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        MetalSliderUI ui = new MetalSliderUI();
        Graphics g = new JPanel().getGraphics();
        ui.paintFocus(g);
    }
}
