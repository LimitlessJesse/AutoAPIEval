import javax.swing.*;
import javax.swing.plaf.multi.MultiToolTipUI;
import java.awt.*;

public class MultiToolTipUI_5 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        toolTip.setUI(new MultiToolTipUI());

        // Set the text of the tooltip
        toolTip.setTipText("This is a tooltip");

        // Set the location of the tooltip
        toolTip.setLocation(100, 100);

        // Update the tooltip
        toolTip.getUI().update(toolTip.getGraphics(), toolTip);
    }
}
