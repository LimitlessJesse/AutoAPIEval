import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class AudioInputStream_2 {
    public static void main(String[] args) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("audio.wav"));
            AudioFormat format = audioInputStream.getFormat();
            System.out.println("Audio Format: " + format.toString());
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
