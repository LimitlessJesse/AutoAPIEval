import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;

public class MidiEvent_1 {
    public static void main(String[] args) {
        MidiEvent midiEvent = new MidiEvent();
        MidiMessage message = midiEvent.getMessage();
        System.out.println("MIDI Message: " + message);
    }
}
