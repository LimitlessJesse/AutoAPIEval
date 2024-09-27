import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_26 {
    public static void main(String[] args) {
        String lexicalFloat = "123.456";
        float floatValue = DatatypeConverter.parseFloat(lexicalFloat);
        System.out.println(floatValue);
    }
}
