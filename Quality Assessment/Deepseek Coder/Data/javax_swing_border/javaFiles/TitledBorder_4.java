import javax.swing.border.TitledBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TitledBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        TitledBorder border = new TitledBorder("Title");
        border.setTitlePosition(TitledBorder.LEFT);
        panel.setBorder(border);

        frame.add(panel);
        frame.setVisible(true);

        int titlePosition = border.getTitlePosition();
        System.out.println("Title position: " + titlePosition);
    }
}
