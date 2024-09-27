import javax.swing.text.DefaultCaret;

public class DefaultCaret_2 {
    public static void main(String[] args) {
        DefaultCaret caret = new DefaultCaret();
        int blinkRate = caret.getBlinkRate();
        System.out.println("Blink rate: " + blinkRate);
    }
}
