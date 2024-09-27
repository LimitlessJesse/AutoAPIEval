import javax.swing.UIDefaults;
import java.util.Hashtable;

public class UIDefaults_2 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        Hashtable<Object, Object> table = new Hashtable<>();
        table.put("key", "value");
        System.out.println(defaults.get(table, "key"));
    }
}
