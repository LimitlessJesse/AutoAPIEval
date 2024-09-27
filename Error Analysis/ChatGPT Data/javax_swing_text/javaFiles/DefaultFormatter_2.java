import javax.swing.text.DefaultFormatter;

public class DefaultFormatter_2 {
    public static void main(String[] args) {
        DefaultFormatter formatter = new DefaultFormatter();
        String text = "123";
        Object value = formatter.stringToValue(text);
        System.out.println("Converted value: " + value);
    }
}
