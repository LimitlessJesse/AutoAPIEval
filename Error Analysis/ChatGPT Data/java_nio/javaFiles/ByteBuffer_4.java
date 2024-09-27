import java.nio.ByteBuffer;

public class ByteBuffer_4 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.putInt(123); // Put an int value into the buffer
        buffer.flip(); // Prepare the buffer for reading

        int intValue = buffer.getInt(); // Get the int value from the buffer
        System.out.println("Int value: " + intValue);
    }
}
