import java.nio.DoubleBuffer;

public class DoubleBuffer_2 {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        DoubleBuffer buffer = DoubleBuffer.wrap(data);

        System.out.println("First element: " + buffer.get());
        System.out.println("Second element: " + buffer.get());
    }
}
