import java.util.Base64;

public class Base64_Decoder_4 {
    public static void main(String[] args) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] src = "SGVsbG8gV29ybGQh".getBytes();
        byte[] dst = new byte[10]; // Ensure dst has enough space for decoding
        
        int numBytesDecoded = decoder.decode(src, dst);
        
        System.out.println("Number of bytes decoded: " + numBytesDecoded);
        System.out.println("Decoded data: " + new String(dst, 0, numBytesDecoded));
    }
}
