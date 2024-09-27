import javax.xml.bind.DatatypeConverter;
import java.math.BigDecimal;

public class DatatypeConverter_5 {
    public static void main(String[] args) {
        String lexicalXSDDecimal = "123.45";
        BigDecimal result = DatatypeConverter.parseDecimal(lexicalXSDDecimal);
        System.out.println("Parsed BigDecimal value: " + result);
    }
}
