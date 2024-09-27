import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class NormalizedStringAdapter_1 {
    public static void main(String[] args) {
        NormalizedStringAdapter adapter = new NormalizedStringAdapter();
        String marshaledString = adapter.marshal("Hello, World!");
        System.out.println(marshaledString);
    }
}
