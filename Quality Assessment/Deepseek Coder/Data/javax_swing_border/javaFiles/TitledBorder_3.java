import javax.swing.*;
import javax.swing.border.TitledBorder;

public class TitledBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        TitledBorder border = BorderFactory.createTitledBorder("My Title");
        border.setTitlePosition(TitledBorder.LEFT);
        panel.setBorder(border);

        frame.add(panel);
        frame.setVisible(true);
    }
}
