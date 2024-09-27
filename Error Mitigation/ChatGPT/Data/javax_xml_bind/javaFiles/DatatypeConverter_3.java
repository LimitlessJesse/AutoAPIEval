import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_3 {
    public static void main(String[] args) {
        String base64String = "SGVsbG8gV29ybGQh"; // Base64 encoded "Hello World!"
        byte[] byteArray = DatatypeConverter.parseBase64Binary(base64String);
        
        System.out.println("Decoded byte array: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
    }
}
