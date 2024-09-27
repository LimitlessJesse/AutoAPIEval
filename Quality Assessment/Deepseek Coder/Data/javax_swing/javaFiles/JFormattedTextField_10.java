import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;

public class JFormattedTextField_10 {
    public static void main(String[] args) {
        JFormattedTextField jft = new JFormattedTextField();
        DecimalFormat df = new DecimalFormat("#");
        NumberFormatter nf = new NumberFormatter(df);
        jft.setFormatterFactory(new DefaultFormatterFactory(nf));
        int focusLostBehavior = jft.getFocusLostBehavior();
        System.out.println(focusLostBehavior);
    }
}
