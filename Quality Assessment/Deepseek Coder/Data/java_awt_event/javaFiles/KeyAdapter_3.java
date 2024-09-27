import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapter_3 extends KeyAdapter {
    public static void main(String[] args) {
        KeyAdapter_3 main = new KeyAdapter_3();
        main.keyTyped(new KeyEvent('A', 0, 0, 0, false, false, false, false));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("Key Typed: " + keyChar);
    }
}
