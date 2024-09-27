import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.spi.AudioFileReader;
import java.io.InputStream;
import javax.sound.sampled.AudioSystem;

public class AudioFileReader_1 {
    public static void main(String[] args) {
        AudioFileReader audioFileReader = AudioSystem.getAudioFileReader();
        try {
            InputStream inputStream = // provide input stream for audio file
            AudioFileFormat audioFileFormat = audioFileReader.getAudioFileFormat(inputStream);
            System.out.println("Audio format: " + audioFileFormat.getType());
            System.out.println("Audio length: " + audioFileFormat.getFrameLength());
            System.out.println("Audio properties: " + audioFileFormat.properties());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
