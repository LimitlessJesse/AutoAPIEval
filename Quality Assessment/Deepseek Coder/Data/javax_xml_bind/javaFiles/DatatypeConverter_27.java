import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_27 {
    public static void main(String[] args) {
        double d = 123.456;
        String doubleAsString = DatatypeConverter.printDouble(d);
        System.out.println(doubleAsString);
    }
}
