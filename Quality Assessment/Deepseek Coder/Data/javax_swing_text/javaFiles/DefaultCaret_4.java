import javax.swing.text.DefaultCaret;

public class DefaultCaret_4 {
    public static void main(String[] args) {
        DefaultCaret caret = new DefaultCaret();
        caret.setVisible(true);
        boolean isCaretVisible = caret.isVisible();
        System.out.println("Is caret visible? " + isCaretVisible);
    }
}
