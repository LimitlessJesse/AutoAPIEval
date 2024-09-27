import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Buffer_4 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        boolean direct = buffer.isDirect();
        System.out.println("Is buffer direct? " + direct);
    }
}
