import javax.sound.midi.Sequence;

public class Sequence_3 {
    public static void main(String[] args) {
        try {
            Sequence sequence = new Sequence(Sequence.PPQ, 24);
            int resolution = sequence.getResolution();
            System.out.println("Resolution: " + resolution);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
