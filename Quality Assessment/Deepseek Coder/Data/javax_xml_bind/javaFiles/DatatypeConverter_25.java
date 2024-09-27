import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_25 {
    public static void main(String[] args) {
        float f = 123.456f;
        String floatAsString = DatatypeConverter.printFloat(f);
        System.out.println(floatAsString);
    }
}
