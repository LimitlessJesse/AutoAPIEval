import javax.swing.Icon;
import javax.swing.JLabel;

public class JLabel_4 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Hello, World!");
        Icon icon = label.getIcon();
        System.out.println("Icon: " + icon);
    }
}
