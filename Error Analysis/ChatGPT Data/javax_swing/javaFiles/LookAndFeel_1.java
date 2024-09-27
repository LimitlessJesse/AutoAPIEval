import javax.swing.UIManager;
import javax.swing.LookAndFeel;

public class LookAndFeel_1 {
    public static void main(String[] args) {
        LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
        String name = lookAndFeel.getName();
        System.out.println("Current LookAndFeel: " + name);
    }
}
