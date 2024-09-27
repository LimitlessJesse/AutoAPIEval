import javax.swing.UIDefaults;

public class UIDefaults_2 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        defaults.put("key1", "value1");
        
        Object value = defaults.get("key1");
        System.out.println(value);
    }
}
