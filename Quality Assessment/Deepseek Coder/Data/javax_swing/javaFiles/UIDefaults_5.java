import javax.swing.UIDefaults;
import javax.swing.JButton;
import java.awt.Color;

public class UIDefaults_5 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        JButton button = new JButton("Click me");
        button.setBackground(Color.RED);
        defaults.put("Button", button);
        System.out.println(defaults.get("Button"));
    }
}
