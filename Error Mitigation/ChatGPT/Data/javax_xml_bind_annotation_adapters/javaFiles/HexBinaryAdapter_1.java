import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class HexBinaryAdapter_1 {
    public static void main(String[] args) {
        HexBinaryAdapter adapter = new HexBinaryAdapter();
        byte[] result = adapter.unmarshal("48656C6C6F"); // Hexadecimal representation of "Hello"
        System.out.println(new String(result)); // Output: Hello
    }
}
