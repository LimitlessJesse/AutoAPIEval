import java.nio.ByteOrder;

public class ByteOrder_1 {
    public static void main(String[] args) {
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        System.out.println("Native Byte Order: " + byteOrder);
    }
}
