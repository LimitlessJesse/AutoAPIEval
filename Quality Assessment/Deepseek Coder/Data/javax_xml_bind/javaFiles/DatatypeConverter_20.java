import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_20 {
    public static void main(String[] args) {
        String lexicalLong = "1234567890";
        long longValue = DatatypeConverter.parseLong(lexicalLong);
        System.out.println(longValue);
    }
}
