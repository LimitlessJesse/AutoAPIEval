import javax.swing.text.MaskFormatter;

public class MaskFormatter_2 {
    public static void main(String[] args) {
        MaskFormatter formatter = new MaskFormatter();
        String mask = formatter.getMask();
        System.out.println("Mask: " + mask);
    }
}
