import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapter_10 {
    public static void main(String[] args) {
        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println("Key pressed: " + keyCode);
            }
        };
    }
}
