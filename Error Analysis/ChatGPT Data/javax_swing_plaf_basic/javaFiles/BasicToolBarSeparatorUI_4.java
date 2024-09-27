import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
import javax.swing.*;
import java.awt.*;

public class BasicToolBarSeparatorUI_4 {
    public static void main(String[] args) {
        // Create a JPanel to use as the JComponent
        JPanel panel = new JPanel();

        // Create a BasicToolBarSeparatorUI object
        BasicToolBarSeparatorUI ui = new BasicToolBarSeparatorUI();

        // Create a Graphics object to use for painting
        Graphics graphics = panel.getGraphics();

        // Call the paint method with the Graphics object and JComponent
        ui.paint(graphics, panel);
    }
}
