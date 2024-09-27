import javax.swing.*;
import javax.swing.plaf.basic.BasicSeparatorUI;
import java.awt.*;

public class BasicSeparatorUI_2 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        BasicSeparatorUI basicSeparatorUI = new BasicSeparatorUI();
        Dimension preferredSize = basicSeparatorUI.getPreferredSize(separator);
        System.out.println("Preferred Width: " + preferredSize.width);
        System.out.println("Preferred Height: " + preferredSize.height);
    }
}
