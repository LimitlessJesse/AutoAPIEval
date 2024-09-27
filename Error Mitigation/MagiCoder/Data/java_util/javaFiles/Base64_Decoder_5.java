import java.util.Base64;

public class Base64_Decoder_5 {
    public static void main(String[] args) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] src = "SGVsbG8gd29ybGQ=".getBytes();
        byte[] decodedBytes = decoder.decode(src);
        System.out.println(new String(decodedBytes));
    }
}
