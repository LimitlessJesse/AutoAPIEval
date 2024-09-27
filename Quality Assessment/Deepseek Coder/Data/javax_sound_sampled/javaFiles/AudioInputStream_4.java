import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import java.io.IOException;

public class AudioInputStream_4 {
    public static void main(String[] args) {
        try {
            File audioFile = new File("path_to_your_audio_file");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            int bytesAvailable = audioStream.available();
            System.out.println("Bytes available: " + bytesAvailable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
