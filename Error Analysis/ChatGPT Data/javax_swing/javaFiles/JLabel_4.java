import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JLabel_4 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Icon Label");
        ImageIcon icon = new ImageIcon("path/to/image.jpg"); // specify the path to your image
        label.setIcon(icon);
        ImageIcon labelIcon = (ImageIcon) label.getIcon();
        System.out.println("Icon retrieved: " + labelIcon);
    }
}
