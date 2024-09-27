import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StyledEditorKit_UnderlineAction_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Underline Action Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(true);

        StyledEditorKit.UnderlineAction underlineAction = new StyledEditorKit.UnderlineAction();
        underlineAction.actionPerformed(new ActionEvent(underlineAction, 0, "Underline"));

        frame.getContentPane().add(textArea);
        frame.setVisible(true);
    }
}
