import javax.swing.text.DefaultCaret;

public class DefaultCaret_4 {
    public static void main(String[] args) {
        DefaultCaret caret = new DefaultCaret();
        caret.setVisible(true);
        System.out.println("isActive(): " + caret.isActive());
        System.out.println("isVisible(): " + caret.isVisible());
        
        caret.setVisible(false);
        System.out.println("isActive(): " + caret.isActive());
        System.out.println("isVisible(): " + caret.isVisible());
    }
}
