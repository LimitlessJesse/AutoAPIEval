import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_2 {
    public static void main(String[] args) {
        byte[] byteArray = {10, 20, 30, 40, 50};
        String base64String = DatatypeConverter.printBase64Binary(byteArray);
        System.out.println("Base64 String: " + base64String);
    }
}
