import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;

public class BasicLabelUI_3 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Hello");
        BasicLabelUI labelUI = new BasicLabelUI();
        Dimension preferredSize = labelUI.getPreferredSize(label);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
