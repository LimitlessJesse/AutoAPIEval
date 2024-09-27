import javax.swing.text.DefaultFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.text.ParseException;

public class DefaultFormatter_2 {
    public static void main(String[] args) {
        DefaultFormatterFactory factory = new DefaultFormatterFactory(new NumberFormatter());
        DefaultFormatter formatter = factory.getFormatter();

        try {
            Object value = formatter.stringToValue("123");
            System.out.println(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
