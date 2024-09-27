import javax.swing.text.DefaultFormatter;
import javax.swing.text.InternationalFormatter;
import java.text.ParseException;

public class InternationalFormatter_1 {
    public static void main(String[] args) {
        InternationalFormatter formatter = new InternationalFormatter();
        try {
            Object value = formatter.stringToValue("123");
            System.out.println(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
