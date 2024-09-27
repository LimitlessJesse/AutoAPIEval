import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class CollapsedStringAdapter_2 {
    public static void main(String[] args) {
        CollapsedStringAdapter adapter = new CollapsedStringAdapter();
        String input = "   Hello   ";
        String output = adapter.marshal(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
