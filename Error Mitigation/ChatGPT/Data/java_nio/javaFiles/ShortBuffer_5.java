import java.nio.ShortBuffer;

public class ShortBuffer_5 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(5);
        buffer.put((short) 1);
        buffer.put((short) 2);
        buffer.put((short) 3);
        buffer.put((short) 4);
        buffer.put((short) 5);

        System.out.println("Before compact:");
        System.out.println("Position: " + buffer.position());
        System.out.println("Limit: " + buffer.limit());

        buffer.position(1);
        ShortBuffer compactedBuffer = buffer.compact();

        System.out.println("\nAfter compact:");
        System.out.println("Position: " + compactedBuffer.position());
        System.out.println("Limit: " + compactedBuffer.limit());
    }
}
