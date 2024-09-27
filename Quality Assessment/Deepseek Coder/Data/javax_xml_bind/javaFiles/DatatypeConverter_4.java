import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_4 {
    public static void main(String[] args) {
        byte[] binaryData = {1, 2, 3, 4, 5};
        String hexString = DatatypeConverter.printHexBinary(binaryData);
        System.out.println(hexString);
    }
}
