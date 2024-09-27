import javax.swing.border.TitledBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class TitledBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Titled Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        TitledBorder border = new TitledBorder("This is a Titled Border");
        border.setTitleJustification(TitledBorder.CENTER);

        panel.setBorder(border);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
