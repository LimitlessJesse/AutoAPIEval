import javax.swing.*;
import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
import java.awt.*;

public class BasicToolBarSeparatorUI_2 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
        toolBar.add(separator);

        BasicToolBarSeparatorUI ui = new BasicToolBarSeparatorUI();
        ui.paint(toolBar.getGraphics(), toolBar);
    }
}
