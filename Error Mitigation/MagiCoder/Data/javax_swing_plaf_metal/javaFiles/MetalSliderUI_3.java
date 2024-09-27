import javax.swing.*;
import javax.swing.plaf.metal.MetalSliderUI;
import java.awt.*;

public class MetalSliderUI_3 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        MetalSliderUI sliderUI = new MetalSliderUI(slider);

        Graphics g = new Graphics(); // You need to provide a Graphics object here
        sliderUI.paintTrack(g);
    }
}
