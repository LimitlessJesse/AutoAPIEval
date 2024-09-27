import java.lang.Byte;

public class Byte_2 {
    public static void main(String[] args) {
        Byte byte1 = new Byte((byte) 10);
        Byte byte2 = new Byte((byte) 5);

        int result = byte1.compareTo(byte2);
        System.out.println("Comparison result: " + result);
    }
}
