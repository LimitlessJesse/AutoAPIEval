import java.nio.DoubleBuffer;

public class DoubleBuffer_2 {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(5);
        buffer.put(3.14);
        System.out.println(buffer.get(0));
    }
}
