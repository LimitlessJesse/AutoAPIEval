import java.util.Base64;

public class Base64_Decoder_1 {
    public static void main(String[] args) {
        String encodedString = "SGVsbG8gV29ybGQh"; // "Hello World!" encoded in Base64
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes = decoder.decode(encodedString);
        
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString); // Output: Hello World!
    }
}
