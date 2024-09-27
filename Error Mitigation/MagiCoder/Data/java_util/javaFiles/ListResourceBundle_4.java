import java.util.ListResourceBundle;

public class MyResourceBundle extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {"key1", "value1"},
            {"key2", "value2"},
            // add more key-value pairs as needed
        };
    }
}

public class ListResourceBundle_4 {
    public static void main(String[] args) {
        MyResourceBundle bundle = new MyResourceBundle();
        Object[][] contents = bundle.getContents();
        for (Object[] content : contents) {
            System.out.println(content[0] + ": " + content[1]);
        }
    }
}
