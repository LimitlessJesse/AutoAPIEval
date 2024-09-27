import java.awt.event.InputMethodEvent;
import java.text.AttributedCharacterIterator;

public class InputMethodEvent_3 {
    public static void main(String[] args) {
        // Create an InputMethodEvent object (inputMethodEvent) for demonstration
        InputMethodEvent inputMethodEvent = new InputMethodEvent(null, 0, null, 0, null, 0, null, null);

        // Get the AttributedCharacterIterator associated with the InputMethodEvent
        AttributedCharacterIterator iterator = inputMethodEvent.getText();

        // Print the text contained in the AttributedCharacterIterator
        StringBuilder text = new StringBuilder();
        for (char c = iterator.first(); c != AttributedCharacterIterator.DONE; c = iterator.next()) {
            text.append(c);
        }
        System.out.println("Text: " + text.toString());
    }
}
