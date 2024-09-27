import javax.sound.midi.Sequence;

public class Sequence_4 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(Sequence.PPQ, 24);
        float divisionType = sequence.getDivisionType();
        System.out.println("Division Type: " + divisionType);
    }
}
