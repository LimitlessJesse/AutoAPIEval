import javax.swing.*;
import javax.swing.plaf.metal.MetalToolTipUI;
import java.awt.*;

public class MetalToolTipUI_3 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        toolTip.setUI(new MetalToolTipUI());
        toolTip.paint(new Graphics(), toolTip);
    }
}
