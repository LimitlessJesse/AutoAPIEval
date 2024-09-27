import javax.sound.midi.MidiEvent;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;
import javax.sound.midi.ShortMessage;

public class MidiEvent_3 {
    public static void main(String[] args) {
        try {
            Sequence sequence = new Sequence(Sequence.PPQ, 1);
            Track track = sequence.createTrack();

            ShortMessage shortMessage = new ShortMessage();
            shortMessage.setMessage(ShortMessage.NOTE_ON, 1, 60, 100);

            MidiEvent noteOn = new MidiEvent(shortMessage, 1);
            track.add(noteOn);

            System.out.println("Tick: " + noteOn.getTick());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
