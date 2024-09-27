import java.nio.ShortBuffer;

public class ShortBuffer_2 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(5);
        buffer.put((short) 1);
        buffer.put((short) 2);
        buffer.put((short) 3);

        System.out.println("Before compact:");
        System.out.println("Position: " + buffer.position());
        System.out.println("Limit: " + buffer.limit());

        buffer.compact();

        System.out.println("\nAfter compact:");
        System.out.println("Position: " + buffer.position());
        System.out.println("Limit: " + buffer.limit());
        System.out.println("Remaining values:");
        
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
