import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class CollapsedStringAdapter_2 {
    public static void main(String[] args) {
        String originalString = "   Hello   ";
        CollapsedStringAdapter adapter = new CollapsedStringAdapter();
        String collapsedString = adapter.marshal(originalString);
        System.out.println("Original String: '" + originalString + "'");
        System.out.println("Collapsed String: '" + collapsedString + "'");
    }
}
