import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;

public class MidiEvent_2 {
    public static void main(String[] args) {
        // Create a ShortMessage
        ShortMessage message = new ShortMessage();
        try {
            message.setMessage(ShortMessage.NOTE_ON, 1, 60, 100);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }

        // Create a MidiMessage from the ShortMessage
        MidiMessage midiMessage = message;

        // Create a MidiEvent with the MidiMessage
        MidiEvent midiEvent = new MidiEvent(midiMessage, 100);

        // Get the MidiMessage from the MidiEvent
        MidiMessage eventMessage = midiEvent.getMessage();

        // Print the MidiMessage
        System.out.println(eventMessage);
    }
}
