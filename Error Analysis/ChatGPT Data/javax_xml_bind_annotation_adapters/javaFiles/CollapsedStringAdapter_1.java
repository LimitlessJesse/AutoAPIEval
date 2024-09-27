import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class CollapsedStringAdapter_1 {
    public static void main(String[] args) {
        CollapsedStringAdapter adapter = new CollapsedStringAdapter();
        String collapsedString = "   This is a collapsed string   ";
        System.out.println("Original String: " + collapsedString);
        String unmarshalledString = adapter.unmarshal(collapsedString);
        System.out.println("Unmarshalled String: " + unmarshalledString);
    }
}
