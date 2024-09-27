import javax.swing.text.MaskFormatter;

public class MaskFormatter_4 {
    public static void main(String[] args) {
        MaskFormatter formatter = new MaskFormatter();
        char placeholder = formatter.getPlaceholderCharacter();
        System.out.println("Placeholder character: " + placeholder);
    }
}
