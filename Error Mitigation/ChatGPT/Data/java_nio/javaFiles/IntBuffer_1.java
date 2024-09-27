import java.nio.IntBuffer;

public class IntBuffer_1 {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(5);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            System.out.println(intBuffer.get(i));
        }
    }
}
