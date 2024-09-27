import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import java.io.File;

public class AudioFileFormat_4 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_audio_file");
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(file);
            AudioFormat format = baseFileFormat.getFormat();
            System.out.println("Audio Format: " + format);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
