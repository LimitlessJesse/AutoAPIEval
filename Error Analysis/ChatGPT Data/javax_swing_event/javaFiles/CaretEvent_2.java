import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class CaretEvent_2 {
    public static void main(String[] args) {
        // Create a CaretListener implementing the caretUpdate method
        CaretListener caretListener = new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int mark = e.getMark();
                System.out.println("Mark: " + mark);
            }
        };

        // Example of using the CaretListener with JTextArea
        JTextArea textArea = new JTextArea();
        textArea.addCaretListener(caretListener);
    }
}
