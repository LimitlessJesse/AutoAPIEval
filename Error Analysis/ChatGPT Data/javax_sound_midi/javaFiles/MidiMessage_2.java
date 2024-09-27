import javax.sound.midi.MidiMessage;

public class MidiMessage_2 {
    public static void main(String[] args) {
        MidiMessage message = new MidiMessage();
        int length = message.getLength();
        System.out.println("Length of MidiMessage: " + length);
    }
}
