import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

public class AudioSystem_4 {
    public static void main(String[] args) {
        try {
            Clip clip = AudioSystem.getClip();
            System.out.println("Clip obtained successfully: " + clip);
        } catch (LineUnavailableException e) {
            System.out.println("LineUnavailableException: " + e.getMessage());
        }
    }
}
