import javax.sound.midi.MidiEvent;
import javax.sound.midi.Track;

public class Track_2 {
    public static void main(String[] args) {
        Track track = new Track();

        // Assume we have added some MidiEvent objects to the track
        
        // Getting the MidiEvent at index 0
        MidiEvent midiEvent = track.get(0);
        
        // Do something with the retrieved MidiEvent
    }
}
