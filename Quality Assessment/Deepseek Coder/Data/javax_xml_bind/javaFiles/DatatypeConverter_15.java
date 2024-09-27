import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_15 {
    public static void main(String[] args) {
        boolean boolValue = true;
        String boolString = DatatypeConverter.printBoolean(boolValue);
        System.out.println(boolString);
    }
}
