import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.UIDefaults;

public class NimbusLookAndFeel_3 {
    public static void main(String[] args) {
        NimbusLookAndFeel nimbusLookAndFeel = new NimbusLookAndFeel();
        UIDefaults defaults = nimbusLookAndFeel.getDefaults();
        System.out.println(defaults);
    }
}
