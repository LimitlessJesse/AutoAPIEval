import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class CaretEvent_2 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        textArea.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int dot = e.getDot();
                System.out.println("Caret position: " + dot);
            }
        });
    }
}
