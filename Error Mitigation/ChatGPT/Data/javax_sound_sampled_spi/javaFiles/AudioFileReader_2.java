import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.spi.AudioFileReader;
import java.io.File;
import java.io.IOException;

public class AudioFileReader_2 {
    public static void main(String[] args) {
        AudioFileReader audioFileReader = AudioSystem.getAudioFileReader();
        File audioFile = new File("example.wav");
        
        try {
            AudioInputStream audioInputStream = audioFileReader.getAudioInputStream(audioFile);
            System.out.println("AudioInputStream created successfully from file: " + audioFile.getName());
        } catch (IOException e) {
            System.out.println("Error reading audio file: " + e.getMessage());
        }
    }
}
