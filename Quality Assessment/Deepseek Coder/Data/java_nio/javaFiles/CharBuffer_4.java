import java.nio.CharBuffer;

public class CharBuffer_4 {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);
        
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((char) ('A' + i));
        }
        
        buffer.flip();
        
        CharBuffer slice = buffer.slice();
        
        // Change the slice
        for (int i = 0; i < slice.limit(); i++) {
            slice.put(i, (char) ('a' + i));
        }
        
        // Print the original buffer
        buffer.position(0);
        for (int i = 0; i < buffer.limit(); i++) {
            System.out.print(buffer.get());
        }
        
        System.out.println();
        
        // Print the slice
        slice.position(0);
        for (int i = 0; i < slice.limit(); i++) {
            System.out.print(slice.get());
        }
    }
}
