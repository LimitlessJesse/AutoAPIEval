import javax.swing.UIDefaults;

public class UIDefaults_2 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        Object[] keyValueList = { "key1", "value1", "key2", "value2" };
        defaults.putDefaults(keyValueList);
    }
}
