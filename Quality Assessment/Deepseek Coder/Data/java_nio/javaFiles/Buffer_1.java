import java.nio.*;

public class Buffer_1 {
    public static void main(String[] args) {
        ByteBuffer buf = ByteBuffer.allocate(10);
        System.out.println("Initial capacity: " + buf.capacity());

        buf.put((byte)1);
        buf.put((byte)2);
        buf.put((byte)3);
        System.out.println("After writing 3 bytes, capacity: " + buf.capacity());

        buf.flip();
        System.out.println("After flipping, capacity: " + buf.capacity());
    }
}
