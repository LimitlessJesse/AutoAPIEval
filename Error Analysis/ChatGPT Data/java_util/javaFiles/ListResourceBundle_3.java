import java.util.ListResourceBundle;

public class MyResourceBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {"key1", "value1"},
            {"key2", "value2"}
        };
    }

    public static void main(String[] args) {
        MyResourceBundle bundle = new MyResourceBundle();
        System.out.println(bundle.handleGetObject("key1"));
    }
}
