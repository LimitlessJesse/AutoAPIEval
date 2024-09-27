import java.nio.IntBuffer;

public class IntBuffer_17 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocateDirect(10);
        System.out.println(buffer.isDirect());
    }
}
