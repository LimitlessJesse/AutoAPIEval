import javax.swing.*;
import javax.swing.plaf.multi.MultiTextUI;
import java.awt.*;

public class MultiTextUI_7 {
    public static void main(String[] args) {
        JTextField textField = new JTextField("Hello, World!");
        MultiTextUI multiTextUI = new MultiTextUI();
        multiTextUI.paint(textField.getGraphics(), textField);
    }
}
