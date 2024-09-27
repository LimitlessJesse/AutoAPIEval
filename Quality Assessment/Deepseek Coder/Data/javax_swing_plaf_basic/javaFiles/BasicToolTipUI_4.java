import javax.swing.*;
import javax.swing.plaf.basic.BasicToolTipUI;
import java.awt.*;

public class BasicToolTipUI_4 {
    public static void main(String[] args) {
        JComponent component = new JLabel("Hello, World!");
        BasicToolTipUI toolTipUI = new BasicToolTipUI();
        Dimension preferredSize = toolTipUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
