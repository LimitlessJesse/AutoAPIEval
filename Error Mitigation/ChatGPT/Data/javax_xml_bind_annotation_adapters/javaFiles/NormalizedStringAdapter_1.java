import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class NormalizedStringAdapter_1 {
    public static void main(String[] args) {
        NormalizedStringAdapter adapter = new NormalizedStringAdapter();
        String result = adapter.unmarshal("Hello\tWorld\n");
        System.out.println(result); // Output: Hello World
    }
}
