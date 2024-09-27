import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MaskFormatter_1 {
    public static void main(String[] args) {
        MaskFormatter formatter = new MaskFormatter();
        try {
            formatter.setMask("###-##-####");
            System.out.println("Mask set successfully");
        } catch (ParseException e) {
            System.out.println("Invalid mask format");
        }
    }
}
