import javax.swing.*;
import javax.swing.plaf.metal.MetalSliderUI;
import java.awt.*;

public class MetalSliderUI_2 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        MetalSliderUI sliderUI = new MetalSliderUI(slider);
        Graphics g = slider.getGraphics();
        sliderUI.paintThumb(g);
    }
}
