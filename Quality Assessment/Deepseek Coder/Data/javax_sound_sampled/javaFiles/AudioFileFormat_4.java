import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class AudioFileFormat_4 {
    public static void main(String[] args) {
        try {
            File audioFile = new File("path_to_your_audio_file");
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(audioFile);
            int frameLength = baseFileFormat.getFrameLength();
            System.out.println("Frame Length: " + frameLength);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
