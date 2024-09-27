import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class HexBinaryAdapter_1 {
    public static void main(String[] args) {
        String hexValue = "48656C6C6F"; // Hexadecimal representation of "Hello"
        
        HexBinaryAdapter adapter = new HexBinaryAdapter();
        byte[] byteArray = adapter.unmarshal(hexValue);
        
        System.out.println("Byte Array: " + byteArray);
    }
}
