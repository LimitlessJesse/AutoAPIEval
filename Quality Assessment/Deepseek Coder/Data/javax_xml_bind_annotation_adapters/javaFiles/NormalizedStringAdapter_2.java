import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class NormalizedStringAdapter_2 {
    public static void main(String[] args) {
        NormalizedStringAdapter adapter = new NormalizedStringAdapter();
        String unmarshalledString = adapter.unmarshal("Hello, World!");
        System.out.println(unmarshalledString);
    }
}
