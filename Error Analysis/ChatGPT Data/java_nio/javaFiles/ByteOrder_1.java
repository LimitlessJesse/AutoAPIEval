import java.nio.ByteOrder;

public class ByteOrder_1 {
    public static void main(String[] args) {
        ByteOrder order = ByteOrder.nativeOrder();
        System.out.println("Native Byte Order: " + order.toString());
    }
}
