import javax.swing.UIDefaults;
import javax.swing.JButton;
import java.awt.Color;

public class UIDefaults_1 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        JButton button = new JButton("Click me");
        defaults.put("Button.background", Color.RED);
        defaults.put("Button.foreground", Color.WHITE);
        button.setUI(new MyButtonUI());
        Color background = (Color) defaults.get("Button.background");
        Color foreground = (Color) defaults.get("Button.foreground");
        System.out.println("Background color: " + background);
        System.out.println("Foreground color: " + foreground);
    }
}
