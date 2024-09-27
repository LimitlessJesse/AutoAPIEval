import javax.sound.midi.MidiMessage;

public class MidiMessage_2 {
    public static void main(String[] args) {
        MidiMessage midiMessage = new MidiMessage();
        int length = midiMessage.getLength();
        System.out.println("Length of the MIDI message: " + length);
    }
}
