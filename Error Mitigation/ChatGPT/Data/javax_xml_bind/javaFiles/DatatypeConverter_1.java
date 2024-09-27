import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_1 {
    public static void main(String[] args) {
        String lexicalXSDString = "Hello";
        String parsedString = DatatypeConverter.parseString(lexicalXSDString);
        System.out.println(parsedString);
    }
}
