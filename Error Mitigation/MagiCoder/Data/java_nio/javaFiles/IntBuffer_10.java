import java.nio.IntBuffer;

public class IntBuffer_10 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }
        buffer.flip();
        IntBuffer slice = buffer.slice();
        for (int i = 0; i < slice.capacity(); i++) {
            System.out.println(slice.get(i));
        }
    }
}
