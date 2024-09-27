import java.lang.Byte;

public class Byte_3 {
    public static void main(String[] args) {
        byte value = 10;
        Byte byteInstance = Byte.valueOf(value);
        System.out.println("Byte instance representing " + value + ": " + byteInstance);
    }
}
