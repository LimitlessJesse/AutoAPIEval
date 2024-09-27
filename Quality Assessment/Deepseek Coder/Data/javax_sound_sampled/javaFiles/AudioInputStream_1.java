import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class AudioInputStream_1 {
    public static void main(String[] args) {
        try {
            File audioFile = new File("path_to_your_audio_file");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = audioStream.read(buffer))!= -1) {
                // Process the audio data in the buffer
            }
            audioStream.close();
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
