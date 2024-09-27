import javax.swing.*;

public class ComponentInputMap_4 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        KeyStroke keyStroke = KeyStroke.getKeyStroke("ENTER");
        ComponentInputMap inputMap = button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.remove(keyStroke);
    }
}
