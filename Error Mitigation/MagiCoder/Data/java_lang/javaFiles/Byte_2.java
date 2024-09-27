import java.lang.Byte;

public class Byte_2 {
    public static void main(String[] args) {
        byte b = Byte.parseByte("123");
        Byte byteObj = new Byte(b);
        byte byteVal = byteObj.byteValue();
        System.out.println("Byte value: " + byteVal);
    }
}
