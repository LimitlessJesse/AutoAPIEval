import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class CollapsedStringAdapter_1 {
    public static void main(String[] args) {
        CollapsedStringAdapter collapsedStringAdapter = new CollapsedStringAdapter();
        String originalString = "  Hello, World  ";
        String collapsedString = collapsedStringAdapter.marshal(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Collapsed String: " + collapsedString);
    }
}
