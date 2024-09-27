import javax.sound.midi.Patch;

public class Patch_3 {
    public static void main(String[] args) {
        Patch patch = new Patch();
        int program = patch.getProgram();
        System.out.println("Program number: " + program);
    }
}
