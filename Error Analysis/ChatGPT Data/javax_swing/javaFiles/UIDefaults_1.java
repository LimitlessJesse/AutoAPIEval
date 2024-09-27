import javax.swing.UIDefaults;

public class UIDefaults_1 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        defaults.put("key", "value");
        System.out.println(defaults.get("key"));
    }
}
