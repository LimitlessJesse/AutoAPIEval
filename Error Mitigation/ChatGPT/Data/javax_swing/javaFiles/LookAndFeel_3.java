import javax.swing.UIManager;
import javax.swing.UIDefaults;
import javax.swing.LookAndFeel;

public class LookAndFeel_3 {
    public static void main(String[] args) {
        LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
        UIDefaults defaults = lookAndFeel.getDefaults();
        System.out.println(defaults);
    }
}
