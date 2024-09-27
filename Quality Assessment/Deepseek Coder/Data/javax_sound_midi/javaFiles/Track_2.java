import javax.sound.midi.MidiEvent;
import javax.sound.midi.Track;

public class Track_2 {
    public static void main(String[] args) {
        // Create a new Track
        Track track = new Track();
        
        // Add a MidiEvent to the Track
        track.add(new MidiEvent(0, 100));
        
        // Get the MidiEvent at index 0
        MidiEvent event = track.get(0);
        
        // Print the MidiEvent
        System.out.println(event);
    }
}
