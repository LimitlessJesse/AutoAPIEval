import javax.sound.midi.MidiEvent;
import javax.sound.midi.Track;

public class Track_2 {
    public static void main(String[] args) {
        Track track = new Track(); // Assuming you have initialized a Track object
        try {
            MidiEvent event = track.get(0); // Getting the event at index 0
            System.out.println(event); // Printing the event
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}
