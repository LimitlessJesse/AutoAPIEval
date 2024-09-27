import java.security.MessageDigestSpi;

public class MessageDigestSpi_2 {
    public static void main(String[] args) {
        // Create a custom MessageDigestSpi object
        MessageDigestSpi messageDigestSpi = new MessageDigestSpi() {
            @Override
            protected void engineUpdate(byte[] input, int offset, int len) {
                // Implement the update functionality here
                System.out.println("Updating digest with input array starting at offset " + offset + " and length " + len);
            }
        };

        // Call the engineUpdate method
        byte[] input = {1, 2, 3, 4, 5};
        int offset = 1;
        int len = 3;
        messageDigestSpi.engineUpdate(input, offset, len);
    }
}
