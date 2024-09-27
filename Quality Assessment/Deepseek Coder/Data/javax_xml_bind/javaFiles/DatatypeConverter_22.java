import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_22 {
    public static void main(String[] args) {
        String lexicalShort = "30000";
        short parsedShort = DatatypeConverter.parseShort(lexicalShort);
        System.out.println(parsedShort);
    }
}
