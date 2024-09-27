import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_4 {
    public static void main(String[] args) {
        byte[] bytes = {0x4A, 0x41, 0x56, 0x41};
        String base64String = DatatypeConverter.printBase64Binary(bytes);
        System.out.println(base64String); // Output: SUpWQQ==
    }
}
