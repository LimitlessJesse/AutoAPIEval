import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_19 {
    public static void main(String[] args) {
        long l = 1234567890;
        String longString = DatatypeConverter.printLong(l);
        System.out.println(longString);
    }
}
