import java.nio.DoubleBuffer;
import java.nio.BufferUnderflowException;

public class DoubleBuffer_1 {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(10);
        buffer.put(3.14);
        
        buffer.flip();
        
        try {
            double value = buffer.get();
            System.out.println("Value retrieved from buffer: " + value);
        } catch (BufferUnderflowException e) {
            System.out.println("Buffer underflow occurred.");
        }
    }
}
