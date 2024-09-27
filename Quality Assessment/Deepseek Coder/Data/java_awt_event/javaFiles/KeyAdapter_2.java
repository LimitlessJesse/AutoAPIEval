import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapter_2 extends KeyAdapter {
    public static void main(String[] args) {
        KeyAdapter_2 main = new KeyAdapter_2();
        main.keyReleased(new KeyEvent(null, 0, 0L, 0, KeyEvent.VK_A, 'A'));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();
        System.out.println("Key released: " + keyCode + " (" + keyChar + ")");
    }
}
