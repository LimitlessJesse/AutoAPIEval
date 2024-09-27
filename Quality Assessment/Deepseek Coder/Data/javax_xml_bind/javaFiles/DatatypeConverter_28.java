import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_28 {
    public static void main(String[] args) {
        String lexicalDouble = "123.456";
        double doubleValue = DatatypeConverter.parseDouble(lexicalDouble);
        System.out.println(doubleValue);
    }
}
