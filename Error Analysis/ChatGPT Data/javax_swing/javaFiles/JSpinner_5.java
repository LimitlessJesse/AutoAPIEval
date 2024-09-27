import javax.swing.*;

public class JSpinner_5 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        JTextField textField = new JTextField();
        spinner.setEditor(textField);
        
        JFrame frame = new JFrame();
        frame.add(spinner);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
