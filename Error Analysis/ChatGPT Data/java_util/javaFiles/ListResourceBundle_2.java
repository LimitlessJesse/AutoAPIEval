import java.util.ListResourceBundle;
import java.util.Enumeration;
import java.util.Locale;

public class MyResourceBundle extends ListResourceBundle {
    
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            { "key1", "value1" },
            { "key2", "value2" }
        };
    }
    
    public static void main(String[] args) {
        MyResourceBundle bundle = new MyResourceBundle();
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + ": " + bundle.getObject(key));
        }
    }
}
