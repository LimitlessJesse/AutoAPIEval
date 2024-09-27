import java.nio.ByteBuffer;

public class Buffer_2 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Initial position: " + buffer.position());

        buffer.put((byte) 1);
        System.out.println("Position after put: " + buffer.position());

        buffer.flip();
        System.out.println("Position after flip: " + buffer.position());

        buffer.get();
        System.out.println("Position after get: " + buffer.position());
    }
}
