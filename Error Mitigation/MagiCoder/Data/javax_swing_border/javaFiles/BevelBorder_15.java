import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class BevelBorder_15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.RAISED));

        frame.add(panel);
        frame.setVisible(true);
    }
}
