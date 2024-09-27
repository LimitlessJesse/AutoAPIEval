import javax.swing.*;
import javax.swing.plaf.basic.BasicTextAreaUI;
import java.awt.*;

public class BasicTextAreaUI_4 {
    public static void main(String[] args) {
        BasicTextAreaUI basicUI = new BasicTextAreaUI();
        JTextArea textArea = new JTextArea();
        Dimension minimumSize = basicUI.getMinimumSize(textArea);
        System.out.println("Minimum Size: " + minimumSize);
    }
}
