import javax.swing.text.InternationalFormatter;
import javax.swing.text.DefaultFormatter;
import java.text.ParseException;

public class InternationalFormatter_1 {
    public static void main(String[] args) {
        InternationalFormatter formatter = new InternationalFormatter();
        try {
            String result = formatter.valueToString(123);
            System.out.println(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
