import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class NormalizedStringAdapter_2 {
    public static void main(String[] args) {
        NormalizedStringAdapter adapter = new NormalizedStringAdapter();
        String input = "   Hello   ";
        String output = adapter.marshal(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
