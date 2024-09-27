import javax.sound.midi.Patch;

public class Patch_1 {
    public static void main(String[] args) {
        Patch patch = new Patch(0, 1);
        int bankNumber = patch.getBank();
        System.out.println("Bank number: " + bankNumber);
    }
}
