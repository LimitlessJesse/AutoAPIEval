import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_5 {
    public static void main(String[] args) {
        String lexicalXSDInt = "10";
        int intValue = DatatypeConverter.parseInt(lexicalXSDInt);
        System.out.println("Parsed int value: " + intValue);
    }
}
