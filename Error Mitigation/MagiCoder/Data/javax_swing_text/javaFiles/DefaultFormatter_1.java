import javax.swing.text.DefaultFormatter;

public class DefaultFormatter_1 {
    public static void main(String[] args) {
        DefaultFormatter formatter = new DefaultFormatter();
        try {
            String result = formatter.valueToString(new Object());
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
