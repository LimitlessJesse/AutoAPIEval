import java.lang.Byte;

public class Byte_5 {
    public static void main(String[] args) {
        byte value = 65;
        int hashCode = Byte.hashCode(value);
        System.out.println("Hash code of " + value + ": " + hashCode);
    }
}
