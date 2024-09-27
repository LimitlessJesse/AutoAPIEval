import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_23 {
    public static void main(String[] args) {
        byte b = (byte) 127;
        String byteString = DatatypeConverter.printByte(b);
        System.out.println(byteString);
    }
}
