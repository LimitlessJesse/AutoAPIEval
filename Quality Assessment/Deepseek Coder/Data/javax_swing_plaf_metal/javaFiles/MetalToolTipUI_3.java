import javax.swing.*;
import javax.swing.plaf.metal.MetalToolTipUI;
import java.awt.*;

public class MetalToolTipUI_3 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        toolTip.setUI(new MetalToolTipUI());
        toolTip.setTipText("This is a tooltip");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(toolTip);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

public class CustomToolTipUI extends MetalToolTipUI {
    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        // Your custom painting code here
    }
}
