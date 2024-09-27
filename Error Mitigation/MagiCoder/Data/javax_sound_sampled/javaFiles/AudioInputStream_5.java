import javax.sound.sampled.*;
import java.io.IOException;

public class AudioInputStream_5 {
    public static void main(String[] args) {
        try {
            AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
            AudioInputStream stream = AudioSystem.getAudioInputStream(format);
            long skippedBytes = stream.skip(1000);
            System.out.println("Skipped " + skippedBytes + " bytes.");
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
