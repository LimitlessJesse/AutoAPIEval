import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class CollapsedStringAdapter_1 {
    public static void main(String[] args) {
        CollapsedStringAdapter adapter = new CollapsedStringAdapter();
        String result = adapter.unmarshal("   Hello   World   ");
        System.out.println(result); // Output: "Hello World"
    }
}
