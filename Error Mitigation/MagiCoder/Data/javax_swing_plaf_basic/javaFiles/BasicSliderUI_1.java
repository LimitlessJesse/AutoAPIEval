import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class BasicSliderUI_1 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        BasicSliderUI basicSliderUI = new BasicSliderUI(slider);
        Graphics g = new Graphics(); // You need to provide a Graphics object here
        basicSliderUI.paintThumb(g);
    }
}
