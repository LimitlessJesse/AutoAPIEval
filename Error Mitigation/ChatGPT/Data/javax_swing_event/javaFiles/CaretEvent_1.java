import javax.swing.event.CaretEvent;

public class CaretEvent_1 {
    public static void main(String[] args) {
        CaretEvent caretEvent = new CaretEvent();
        int dot = caretEvent.getDot();
        System.out.println("Location of the caret: " + dot);
    }
}
