import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;

public class BasicLabelUI_2 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Hello, World!");
        label.setUI(new BasicLabelUI());
        label.setSize(100, 50);
        label.setVisible(true);

        label.paint(label.getGraphics());
    }
}
