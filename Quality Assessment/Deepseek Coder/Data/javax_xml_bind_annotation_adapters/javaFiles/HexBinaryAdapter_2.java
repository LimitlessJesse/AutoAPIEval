import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class HexBinaryAdapter_2 {
    public static void main(String[] args) {
        HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
        String hexString = "48656c6c6f20576f726c64"; // "Hello World" in hex
        byte[] bytes = hexBinaryAdapter.unmarshal(hexString);
        System.out.println(new String(bytes));
    }
}
