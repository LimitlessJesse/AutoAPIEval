import javax.swing.text.DefaultCaret;

public class DefaultCaret_4 {
    public static void main(String[] args) {
        DefaultCaret caret = new DefaultCaret();
        boolean visible = caret.isVisible();
        System.out.println("Is the caret visible? " + visible);
    }
}
