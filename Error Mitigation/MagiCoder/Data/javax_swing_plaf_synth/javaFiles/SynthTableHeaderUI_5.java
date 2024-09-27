import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class CustomTableHeaderUI extends SynthTableHeaderUI {

    @Override
    protected void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        // Your custom painting code here
    }

    @Override
    public void update(Graphics g, JComponent c) {
        super.update(g, c);
    }
}
