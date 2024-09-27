import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_1 {
    public static void main(String[] args) {
        String base64String = "SGVsbG8gV29ybGQh"; // Base64 encoded string
        byte[] byteArray = DatatypeConverter.parseBase64Binary(base64String);
        
        System.out.println("Byte array length: " + byteArray.length);
    }
}
