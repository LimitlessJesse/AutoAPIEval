import javax.sound.midi.MidiMessage;

public class MidiMessage_4 {
    public static void main(String[] args) {
        MidiMessage midiMessage = new MidiMessage() {
            @Override
            public Object clone() {
                return super.clone();
            }
        };
        
        MidiMessage clonedMessage = (MidiMessage) midiMessage.clone();
    }
}
