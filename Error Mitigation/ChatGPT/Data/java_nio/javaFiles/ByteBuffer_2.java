import java.nio.ByteBuffer;

public class ByteBuffer_2 {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4, 5};
        ByteBuffer buffer = ByteBuffer.wrap(array);
        
        System.out.println("Buffer capacity: " + buffer.capacity());
        System.out.println("Buffer limit: " + buffer.limit());
        System.out.println("Buffer position: " + buffer.position());
        System.out.println("Buffer content: ");
        
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
    }
}
