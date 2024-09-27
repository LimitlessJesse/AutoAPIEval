import javax.swing.*;
import javax.swing.plaf.basic.BasicSeparatorUI;
import java.awt.*;

public class BasicSeparatorUI_3 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        BasicSeparatorUI basicSeparatorUI = new BasicSeparatorUI();
        Dimension preferredSize = basicSeparatorUI.getPreferredSize(separator);
        System.out.println("Preferred size: " + preferredSize);
    }
}
