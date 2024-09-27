import javax.swing.text.DefaultCaret;

public class DefaultCaret_3 {
    public static void main(String[] args) {
        DefaultCaret caret = new DefaultCaret();
        boolean selectionVisible = caret.isSelectionVisible();
        System.out.println("Is selection visible: " + selectionVisible);
    }
}
