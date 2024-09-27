import javax.swing.*;
import java.awt.event.ActionEvent;

public class InputMap_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InputMap Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        InputMap inputMap = frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = frame.getRootPane().getActionMap();
        
        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl A");
        Object actionMapKey = new Object();
        
        inputMap.put(keyStroke, actionMapKey);
        
        actionMap.put(actionMapKey, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ctrl A Pressed");
            }
        });
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
