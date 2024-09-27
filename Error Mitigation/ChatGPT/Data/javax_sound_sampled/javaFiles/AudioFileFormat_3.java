import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;

public class AudioFileFormat_3 {
    public static void main(String[] args) {
        AudioFileFormat audioFileFormat = new AudioFileFormat();
        AudioFormat audioFormat = audioFileFormat.getFormat();
        System.out.println("Audio Data Format: " + audioFormat);
    }
}
