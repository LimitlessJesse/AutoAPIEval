import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;

public class BasicLabelUI_1 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Sample Text");
        Dimension preferredSize = BasicLabelUI.getPreferredSize(label);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
