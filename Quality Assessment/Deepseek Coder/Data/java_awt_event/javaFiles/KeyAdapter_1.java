import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapter_1 extends KeyAdapter {
    public static void main(String[] args) {
        KeyAdapter_1 main = new KeyAdapter_1();
        main.keyPressed(new KeyEvent(null, 0, 0, 0, 'A', 'A'));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key code: " + keyCode);
    }
}
