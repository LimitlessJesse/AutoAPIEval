import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_21 {
    public static void main(String[] args) {
        short s = 123;
        String shortString = DatatypeConverter.printShort(s);
        System.out.println(shortString);
    }
}
