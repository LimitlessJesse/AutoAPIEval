import javax.sound.midi.Track;

public class Track_3 {
    public static void main(String[] args) {
        Track track = new Track();
        int size = track.size();
        System.out.println("Size of the track's event vector: " + size);
    }
}
