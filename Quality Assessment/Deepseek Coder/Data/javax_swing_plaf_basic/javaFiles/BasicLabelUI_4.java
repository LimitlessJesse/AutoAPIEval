import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;

public class BasicLabelUI_4 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Hello, World!");
        BasicLabelUI basicLabelUI = new BasicLabelUI();
        basicLabelUI.installUI(label);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
