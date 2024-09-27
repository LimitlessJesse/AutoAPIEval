import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.awt.*;

public class TitledBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Title"));

        TitledBorder titledBorder = (TitledBorder) panel.getBorder();
        Font titleFont = new Font("Arial", Font.BOLD, 12);
        titledBorder.setTitleFont(titleFont);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
