import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JLabel_2 {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("path_to_icon.png");
        label.setIcon(icon);
    }
}
