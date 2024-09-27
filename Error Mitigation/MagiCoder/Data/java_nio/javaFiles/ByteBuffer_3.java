import java.nio.ByteBuffer;

public class ByteBuffer_3 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        byte[] dst = new byte[10];

        // Populate the buffer
        for (int i = 0; i < 10; i++) {
            buffer.put((byte) i);
        }

        // Flip the buffer
        buffer.flip();

        // Get bytes from the buffer
        buffer.get(dst, 0, 5);

        // Print the destination array
        for (byte b : dst) {
            System.out.print(b + " ");
        }
    }
}
