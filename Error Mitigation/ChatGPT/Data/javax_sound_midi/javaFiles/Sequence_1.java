import javax.sound.midi.Sequence;
import javax.sound.midi.Track;

public class Sequence_1 {
    public static void main(String[] args) {
        try {
            Sequence sequence = new Sequence(Sequence.PPQ, 24);
            Track track = sequence.createTrack();
            System.out.println("Track created successfully");
        } catch (Exception e) {
            System.out.println("Error creating track: " + e.getMessage());
        }
    }
}
