import java.util.Base64;

public class Base64_2 {
    public static void main(String[] args) {
        Base64.Decoder decoder = Base64.getDecoder();
        String encodedString = "SGVsbG8gV29ybGQ=";
        byte[] decodedBytes = decoder.decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
    }
}
