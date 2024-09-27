import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;

public class MidiMessage_3 {
    public static void main(String[] args) {
        try {
            // Create a ShortMessage
            ShortMessage message = new ShortMessage();
            message.setMessage(ShortMessage.NOTE_ON, 0, 60, 100);

            // Get the length of the MidiMessage
            int length = message.getLength();
            System.out.println("Length of the MidiMessage: " + length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
