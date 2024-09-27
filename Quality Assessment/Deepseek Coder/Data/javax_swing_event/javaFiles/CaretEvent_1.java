import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class CaretEvent_1 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        textField.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int mark = e.getMark();
                System.out.println("Mark position: " + mark);
            }
        });

        textField.setText("Hello, World!");
    }
}
