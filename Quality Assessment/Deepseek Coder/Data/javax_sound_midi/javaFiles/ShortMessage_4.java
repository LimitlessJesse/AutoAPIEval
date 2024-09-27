import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class ShortMessage_4 {
    public static void main(String[] args) {
        ShortMessage msg = new ShortMessage();
        MidiEvent event = new MidiEvent(msg, 100);
        int data = event.getMessage().getData1();
        System.out.println("Data: " + data);
    }
}
