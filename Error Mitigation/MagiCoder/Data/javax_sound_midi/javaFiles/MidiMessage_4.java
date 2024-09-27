import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;

public class MidiMessage_4 {
    public static void main(String[] args) {
        try {
            // Create a ShortMessage
            ShortMessage message = new ShortMessage();
            message.setMessage(ShortMessage.NOTE_ON, 1, 60, 100);

            // Get the MidiMessage
            MidiMessage midiMessage = message;

            // Get the message data
            byte[] messageData = midiMessage.getMessage();

            // Print the message data
            for (byte b : messageData) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
