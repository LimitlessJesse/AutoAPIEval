import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenuItem_1 {
    public static void main(String[] args) {
        JMenuItem menuItem = new JMenuItem("Menu Item");
        KeyStroke keyStroke = KeyStroke.getKeyStroke("control A");
        menuItem.setAccelerator(keyStroke);
    }
}
