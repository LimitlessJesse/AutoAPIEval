import java.nio.IntBuffer;

public class IntBuffer_2 {
    public static void main(String[] args) {
        IntBuffer originalBuffer = IntBuffer.allocate(5);
        originalBuffer.put(new int[]{1, 2, 3, 4, 5});
        
        IntBuffer duplicateBuffer = originalBuffer.duplicate();
        
        System.out.println("Original Buffer:");
        while(originalBuffer.hasRemaining()) {
            System.out.print(originalBuffer.get() + " ");
        }
        
        System.out.println("\nDuplicate Buffer:");
        while(duplicateBuffer.hasRemaining()) {
            System.out.print(duplicateBuffer.get() + " ");
        }
    }
}
