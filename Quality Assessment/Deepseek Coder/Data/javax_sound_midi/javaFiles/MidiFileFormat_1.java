import javax.sound.midi.*;

public class MidiFileFormat_1 {
    public static void main(String[] args) {
        try {
            Sequence sequence = MidiSystem.getSequence(new File("path/to/your/midi/file"));
            int type = sequence.getMidiFileFormat().getType();
            System.out.println("Midi file type: " + type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
