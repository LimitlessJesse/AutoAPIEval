import javax.swing.*;
import javax.swing.plaf.basic.BasicTextAreaUI;
import java.awt.*;

public class BasicTextAreaUI_3 {
    public static void main(String[] args) {
        BasicTextAreaUI basicUI = new BasicTextAreaUI();
        JTextArea textArea = new JTextArea();
        Dimension preferredSize = basicUI.getPreferredSize(textArea);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
