import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StyledEditorKit_FontSizeAction_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Increase Font Size");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StyledEditorKit.FontSizeAction fontSizeAction = new StyledEditorKit.FontSizeAction("Increase Font Size", 1.0f);
                fontSizeAction.actionPerformed(e);
            }
        });

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
