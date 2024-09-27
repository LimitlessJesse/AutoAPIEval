import java.nio.IntBuffer;

public class IntBuffer_4 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }
        buffer.flip();
        int value = buffer.get(5);
        System.out.println("The int at index 5 is: " + value);
    }
}
