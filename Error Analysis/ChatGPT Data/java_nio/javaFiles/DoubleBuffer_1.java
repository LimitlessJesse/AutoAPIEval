import java.nio.DoubleBuffer;

public class DoubleBuffer_1 {
    public static void main(String[] args) {
        double[] src = {1.0, 2.0, 3.0, 4.0, 5.0};
        DoubleBuffer buffer = DoubleBuffer.allocate(5);
        buffer.put(src);

        buffer.flip();

        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
