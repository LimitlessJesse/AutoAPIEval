import javax.swing.*;
import javax.swing.plaf.basic.BasicSeparatorUI;

public class BasicSeparatorUI_4 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        BasicSeparatorUI basicSeparatorUI = new BasicSeparatorUI();
        basicSeparatorUI.installUI(separator);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(separator);
        frame.pack();
        frame.setVisible(true);
    }
}
