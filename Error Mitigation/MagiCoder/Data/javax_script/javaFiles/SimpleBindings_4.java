import javax.script.SimpleBindings;
import java.util.Set;

public class SimpleBindings_4 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("key1", "value1");
        bindings.put("key2", "value2");

        Set<String> keys = bindings.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + bindings.get(key));
        }
    }
}
