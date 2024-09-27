import java.nio.ShortBuffer;

public class ShortBuffer_4 {
    public static void main(String[] args) {
        ShortBuffer originalBuffer = ShortBuffer.allocate(5);
        originalBuffer.put(new short[]{1, 2, 3, 4, 5});
        
        ShortBuffer duplicateBuffer = originalBuffer.duplicate();
        
        System.out.println("Original Buffer:");
        while (originalBuffer.hasRemaining()) {
            System.out.print(originalBuffer.get() + " ");
        }
        
        System.out.println("\nDuplicate Buffer:");
        while (duplicateBuffer.hasRemaining()) {
            System.out.print(duplicateBuffer.get() + " ");
        }
    }
}
