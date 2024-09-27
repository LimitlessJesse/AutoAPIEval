import javax.swing.Icon;
import javax.swing.JLabel;

public class JLabel_3 {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        Icon icon = new ImageIcon("path/to/icon.png");
        label.setIcon(icon);
    }
}
