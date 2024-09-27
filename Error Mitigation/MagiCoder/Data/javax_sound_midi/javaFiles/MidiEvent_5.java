import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class MidiEvent_5 {
    public static void main(String[] args) {
        ShortMessage message = new ShortMessage();
        MidiEvent event = new MidiEvent(message, 100);
        event.setTick(500);
        System.out.println("Tick: " + event.getTick());
    }
}
