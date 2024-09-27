import javax.sound.midi.Track;

public class Track_5 {
    public static void main(String[] args) {
        Track track = new Track();
        long totalTicks = track.ticks();
        System.out.println("Total duration of the track in ticks: " + totalTicks);
    }
}
