import java.util.Enumeration;
import java.util.ResourceBundle;

public class ListResourceBundle_2 {
    public static void main(String[] args) {
        ListResourceBundle bundle = new ListResourceBundle() {
            @Override
            protected Object[][] getContents() {
                return new Object[][] {
                    {"key1", "value1"},
                    {"key2", "value2"}
                };
            }
        };
        
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key);
        }
    }
}
