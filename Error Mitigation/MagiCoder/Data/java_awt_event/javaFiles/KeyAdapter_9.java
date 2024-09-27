import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapter_9 {
    public static void main(String[] args) {
        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key typed: " + e.getKeyChar());
            }
        };

        // You can use the keyAdapter here, for example, in a JTextField
        // textField.addKeyListener(keyAdapter);
    }
}
