import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MaskFormatter_3 {
    public static void main(String[] args) {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##-##-####");
            maskFormatter.setValueContainsLiteralCharacters(false);
            Object value = maskFormatter.stringToValue("12-34-5678");
            System.out.println(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
