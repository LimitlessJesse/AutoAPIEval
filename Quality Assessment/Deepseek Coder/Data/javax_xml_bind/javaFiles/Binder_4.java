import javax.xml.bind.Binder;
import java.util.HashMap;
import java.util.Map;

public class Binder_4 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Binder binder = new Binder();
        binder.setProperty(map, "key", "value");
        System.out.println(map);
    }
}
