import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DefaultEditorKit_BeepAction_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                new DefaultEditorKit.BeepAction().actionPerformed(e);
            }
        });

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
