import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_1 {
    public static void main(String[] args) {
        String base64String = "SGVsbG8gd29ybGQ="; // "Hello world" in base64
        byte[] byteArray = DatatypeConverter.parseBase64Binary(base64String);
        System.out.println(new String(byteArray));
    }
}
