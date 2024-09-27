import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import java.io.IOException;

public class AudioInputStream_4 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_audio_file");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            int available = audioInputStream.available();
            System.out.println("Available bytes: " + available);
            audioInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
