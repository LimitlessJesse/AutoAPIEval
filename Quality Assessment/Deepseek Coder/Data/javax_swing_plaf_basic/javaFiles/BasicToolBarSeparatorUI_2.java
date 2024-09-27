import javax.swing.*;
import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
import java.awt.*;

public class BasicToolBarSeparatorUI_2 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        JSeparator separator = new JSeparator();
        toolBar.add(separator);

        BasicToolBarSeparatorUI separatorUI = new BasicToolBarSeparatorUI();
        Dimension preferredSize = separatorUI.getPreferredSize(separator);

        System.out.println("Preferred size of the separator: " + preferredSize);
    }
}
