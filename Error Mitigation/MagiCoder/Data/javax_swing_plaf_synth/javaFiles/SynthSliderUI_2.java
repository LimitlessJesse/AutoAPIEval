import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthSliderUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JSlider slider = new JSlider(0, 100, 50);
        SynthSliderUI sliderUI = new SynthSliderUI(slider);
        BasicSliderUI basicSliderUI = new BasicSliderUI(slider);

        sliderUI.installUI(slider);
        sliderUI.installDefaults(slider);

        sliderUI.paint(slider.getGraphics(), slider);

        frame.add(slider);
        frame.setVisible(true);
    }
}
