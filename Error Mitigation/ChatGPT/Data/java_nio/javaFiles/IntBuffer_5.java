import java.nio.IntBuffer;

public class IntBuffer_5 {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(5);
        intBuffer.put(1);
        intBuffer.put(2);
        intBuffer.put(3);
        intBuffer.put(4);
        intBuffer.put(5);

        System.out.println("Before compact:");
        System.out.println("Position: " + intBuffer.position());
        System.out.println("Limit: " + intBuffer.limit());

        IntBuffer compactedBuffer = intBuffer.compact();

        System.out.println("\nAfter compact:");
        System.out.println("Position: " + compactedBuffer.position());
        System.out.println("Limit: " + compactedBuffer.limit());
    }
}
