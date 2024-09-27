import javax.swing.UIDefaults;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class NimbusLookAndFeel_4 {
    public static void main(String[] args) {
        UIDefaults defaults = new NimbusLookAndFeel().getDefaults();
        System.out.println(defaults); // Print out the UIDefaults object
    }
}
