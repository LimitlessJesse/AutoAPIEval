import javax.sound.midi.Patch;

public class Patch_2 {
    public static void main(String[] args) {
        Patch patch = new Patch(0, 0);
        int program = patch.getProgram();
        System.out.println("Instrument's program number: " + program);
    }
}
