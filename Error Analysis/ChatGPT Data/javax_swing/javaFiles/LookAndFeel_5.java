import javax.swing.LookAndFeel;
import javax.swing.Icon;
import javax.swing.JButton;

public class LookAndFeel_5 {
    public static void main(String[] args) {
        LookAndFeel lookAndFeel = new LookAndFeel() {
        };
        
        JButton button = new JButton("Click me");
        Icon icon = button.getIcon();
        Icon disabledIcon = lookAndFeel.getDisabledIcon(button, icon);
        
        button.setIcon(icon);
        button.setDisabledIcon(disabledIcon);
    }
}
