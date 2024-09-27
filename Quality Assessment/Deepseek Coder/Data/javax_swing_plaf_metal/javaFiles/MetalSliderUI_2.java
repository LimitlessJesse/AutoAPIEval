import javax.swing.*;
import javax.swing.plaf.metal.MetalSliderUI;
import java.awt.*;

public class CustomSliderUI extends MetalSliderUI {

    public CustomSliderUI(JSlider b) {
        super(b);
    }

    @Override
    protected void paintThumb(Graphics g) {
        // Call the superclass's paintThumb method first
        super.paintThumb(g);

        // Now add your custom painting code here
        g.setColor(Color.RED);
        g.fillRect(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
    }
}
