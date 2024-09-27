import java.util.Base64;

public class Base64_Decoder_2 {
    public static void main(String[] args) {
        // Create a decoder
        Base64.Decoder decoder = Base64.getDecoder();

        // Create a source byte array
        byte[] source = "SGVsbG8gd29ybGQ=".getBytes();

        // Create a target byte array
        byte[] target = new byte[100];

        // Decode the source byte array into the target byte array
        int decodedBytes = decoder.decode(source, target);

        // Print the decoded bytes
        System.out.println("Decoded bytes: " + decodedBytes);

        // Print the decoded string
        System.out.println("Decoded string: " + new String(target, 0, decodedBytes));
    }
}
