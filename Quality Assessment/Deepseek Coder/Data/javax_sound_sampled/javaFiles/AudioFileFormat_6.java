import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class AudioFileFormat_6 {
    public static void main(String[] args) {
        try {
            File audioFile = new File("path_to_your_audio_file");
            AudioFileFormat baseFileFormat = AudioSystem.getAudioFileFormat(audioFile);
            long byteLength = baseFileFormat.getByteLength();
            System.out.println("The length of the audio file in bytes is: " + byteLength);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
