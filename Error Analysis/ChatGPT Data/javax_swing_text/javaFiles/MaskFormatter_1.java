import javax.swing.text.MaskFormatter;

public class MaskFormatter_1 {
    public static void main(String[] args) {
        try {
            MaskFormatter formatter = new MaskFormatter("###-##-####");
            formatter.setPlaceholderCharacter('*');
            System.out.println(formatter.getPlaceholderCharacter());
        } catch (java.text.ParseException ex) {
            System.err.println("Error creating mask formatter");
        }
    }
}
