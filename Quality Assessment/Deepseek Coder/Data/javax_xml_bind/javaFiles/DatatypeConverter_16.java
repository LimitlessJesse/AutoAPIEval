import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_16 {
    public static void main(String[] args) {
        String lexicalBoolean = "true";
        boolean parsedBoolean = DatatypeConverter.parseBoolean(lexicalBoolean);
        System.out.println(parsedBoolean);
    }
}
