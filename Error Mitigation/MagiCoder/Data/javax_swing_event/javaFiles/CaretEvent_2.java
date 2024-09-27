import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class CaretEvent_2 {
    public static void main(String[] args) {
        JTextField textField = new JTextField(20);
        textField.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int dot = e.getDot();
                System.out.println("Caret position: " + dot);
            }
        });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
    }
}
