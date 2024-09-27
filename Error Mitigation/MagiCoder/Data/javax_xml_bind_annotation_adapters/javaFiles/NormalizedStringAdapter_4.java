import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class NormalizedStringAdapter_4 {
    public static void main(String[] args) {
        NormalizedStringAdapter adapter = new NormalizedStringAdapter();
        String text = "Hello\tWorld\n";
        String result = adapter.unmarshal(text);
        System.out.println(result);
    }
}
