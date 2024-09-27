import javax.swing.text.DefaultCaret;

public class DefaultCaret_3 {
    public static void main(String[] args) {
        DefaultCaret caret = new DefaultCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }
}
