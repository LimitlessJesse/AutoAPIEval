import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MaskFormatter_2 {
    public static void main(String[] args) {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##-##-####");
            maskFormatter.setValueContainsLiteralCharacters(false);
            String formattedValue = maskFormatter.valueToString("1234567890");
            System.out.println(formattedValue);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
