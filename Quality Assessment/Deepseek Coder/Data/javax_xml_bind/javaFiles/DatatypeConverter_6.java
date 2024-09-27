import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_6 {
    public static void main(String[] args) {
        String lexicalXSDDateTime = "2022-12-31T23:59:59Z";
        System.out.println(DatatypeConverter.parseDateTime(lexicalXSDDateTime));
    }
}
