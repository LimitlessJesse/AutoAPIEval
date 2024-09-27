import java.util.ListResourceBundle;

public class MyResourceBundle extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][] {
            {"key1", "value1"},
            {"key2", "value2"},
            {"key3", "value3"}
        };
    }

    public static void main(String[] args) {
        MyResourceBundle bundle = new MyResourceBundle();
        Object[][] contents = bundle.getContents();
        
        for (Object[] pair : contents) {
            System.out.println(pair[0] + ": " + pair[1]);
        }
    }
}
