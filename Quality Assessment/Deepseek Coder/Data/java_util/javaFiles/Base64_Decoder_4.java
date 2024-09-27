import java.util.Base64;

public class Base64_Decoder_4 {
    public static void main(String[] args) {
        String encodedString = "SGVsbG8gd29ybGQ=";
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes = decoder.decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
    }
}
