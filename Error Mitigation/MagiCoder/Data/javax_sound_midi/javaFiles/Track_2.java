import javax.sound.midi.MidiEvent;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;
import javax.sound.midi.MidiSystem;

public class Track_2 {
    public static void main(String[] args) {
        try {
            Sequence sequence = new Sequence(Sequence.PPQ, 1);
            Track track = sequence.createTrack();

            // Add some MIDI events to the track
            track.add(new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, 60, 100), 0));
            track.add(new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, 60, 100), 100));

            // Get the MIDI event at index 0
            MidiEvent event = track.get(0);
            System.out.println(event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
