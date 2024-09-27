import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_24 {
    public static void main(String[] args) {
        String lexicalByte = "42";
        byte byteValue = DatatypeConverter.parseByte(lexicalByte);
        System.out.println(byteValue);
    }
}
