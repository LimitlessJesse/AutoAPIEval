import javax.swing.*;
import javax.swing.plaf.basic.BasicSeparatorUI;
import java.awt.*;

public class BasicSeparatorUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Separator Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JSeparator separator = new JSeparator();
        separator.setUI(new BasicSeparatorUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                // Custom painting code here
            }
        });

        frame.getContentPane().add(separator);
        frame.setVisible(true);
    }
}
