import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class MyResourceBundle extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][] {
            {"key1", "value1"},
            {"key2", "value2"}
        };
    }
}

public class ListResourceBundle_3 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResourceBundle");
        System.out.println(bundle.getString("key1"));
    }
}
