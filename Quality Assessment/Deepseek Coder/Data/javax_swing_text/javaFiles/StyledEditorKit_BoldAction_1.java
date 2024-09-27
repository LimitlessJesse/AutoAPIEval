import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StyledEditorKit_BoldAction_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bold Action Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        frame.add(textArea);

        StyledEditorKit.BoldAction boldAction = new StyledEditorKit.BoldAction();
        boldAction.actionPerformed(new ActionEvent(textArea, ActionEvent.ACTION_PERFORMED, "Bold"));

        frame.pack();
        frame.setVisible(true);
    }
}
