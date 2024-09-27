import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;

public class MidiMessage_2 {
    public static void main(String[] args) {
        try {
            // Create a ShortMessage object
            ShortMessage msg = new ShortMessage();
            msg.setMessage(ShortMessage.NOTE_ON, 1, 60, 100);

            // Get the status byte
            int status = msg.getStatus();
            System.out.println("Status: " + status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
