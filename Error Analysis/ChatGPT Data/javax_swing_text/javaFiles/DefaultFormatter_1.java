import javax.swing.text.DefaultFormatter;

public class DefaultFormatter_1 {
    public static void main(String[] args) {
        DefaultFormatter formatter = new DefaultFormatter();
        
        Object value = "Example";
        String formattedValue = formatter.valueToString(value);
        System.out.println("Formatted value: " + formattedValue);
    }
}
