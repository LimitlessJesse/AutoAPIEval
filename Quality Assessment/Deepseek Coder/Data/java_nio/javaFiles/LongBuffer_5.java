import java.nio.*;

public class LongBuffer_5 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);
        
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((long) i);
        }
        
        // flip the buffer
        buffer.flip();
        
        // get a slice from the buffer
        LongBuffer slice = buffer.slice();
        
        // change the elements of the slice
        for (int i = 0; i < slice.capacity(); i++) {
            slice.put(i, (long) (slice.get(i) * 10));
        }
        
        // reset the buffer
        buffer.position(0);
        buffer.limit(buffer.capacity());
        
        // print the elements of the buffer
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
    }
}
