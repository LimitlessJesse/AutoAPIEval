import java.nio.*;

public class Buffer_5 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Remaining: " + buffer.remaining());
        buffer.put((byte)1);
        System.out.println("Remaining after put: " + buffer.remaining());
        System.out.println("Has remaining: " + buffer.hasRemaining());
    }
}
