import javax.swing.border.TitledBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class TitledBorder_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        TitledBorder border = new TitledBorder("Title");
        panel.setBorder(border);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

        int titleJustification = border.getTitleJustification();
        System.out.println("Title Justification: " + titleJustification);
    }
}
