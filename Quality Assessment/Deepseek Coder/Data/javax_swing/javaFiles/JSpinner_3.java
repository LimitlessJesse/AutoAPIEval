import javax.swing.*;
import java.awt.*;

public class JSpinner_3 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(spinner);
        spinner.setEditor(editor);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.getContentPane().add(spinner, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
