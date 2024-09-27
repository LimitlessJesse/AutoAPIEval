import javax.swing.text.MaskFormatter;

public class MaskFormatter_2 {
    public static void main(String[] args) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter("####-####");
            formatter.setValidCharacters("0123456789");
            System.out.println("Valid characters set successfully");
        } catch (java.text.ParseException e) {
            System.out.println("Error setting valid characters: " + e.getMessage());
        }
    }
}
