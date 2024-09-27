import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class NormalizedStringAdapter_3 {
    public static void main(String[] args) {
        NormalizedStringAdapter adapter = new NormalizedStringAdapter();
        String input = "Hello, World!";
        String output = adapter.marshal(input);
        System.out.println(output);
    }
}
