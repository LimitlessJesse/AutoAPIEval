import javax.swing.text.DefaultCaret;

public class DefaultCaret_2 {
    public static void main(String[] args) {
        DefaultCaret caret = new DefaultCaret();
        int updatePolicy = caret.getUpdatePolicy();
        System.out.println("Update policy: " + updatePolicy);
    }
}
