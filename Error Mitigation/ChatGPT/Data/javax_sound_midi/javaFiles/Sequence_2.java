import javax.sound.midi.Sequence;

public class Sequence_2 {
    public static void main(String[] args) {
        try {
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            long duration = sequence.getMicrosecondLength();
            System.out.println("Duration of the sequence in microseconds: " + duration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
