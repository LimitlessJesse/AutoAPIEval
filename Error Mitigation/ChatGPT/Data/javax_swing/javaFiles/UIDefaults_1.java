import javax.swing.UIDefaults;

public class UIDefaults_1 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        defaults.put("key1", "value1");
        defaults.put("key2", "value2");

        Object value1 = defaults.get("key1");
        Object value2 = defaults.get("key2");

        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key2: " + value2);
    }
}
