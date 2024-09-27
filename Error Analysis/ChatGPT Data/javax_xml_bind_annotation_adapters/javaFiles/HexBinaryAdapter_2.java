import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class HexBinaryAdapter_2 {
    public static void main(String[] args) {
        HexBinaryAdapter adapter = new HexBinaryAdapter();
        byte[] byteArray = {0x48, 0x65, 0x6C, 0x6C, 0x6F}; // "Hello" in byte array
        String hexString = adapter.marshal(byteArray);
        System.out.println(hexString); // Output: 48656C6C6F
    }
}
