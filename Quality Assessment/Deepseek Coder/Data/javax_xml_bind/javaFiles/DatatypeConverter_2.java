import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_2 {
    public static void main(String[] args) {
        byte[] binaryData = "Hello, World!".getBytes();
        String base64String = DatatypeConverter.printBase64Binary(binaryData);
        System.out.println(base64String);
    }
}
