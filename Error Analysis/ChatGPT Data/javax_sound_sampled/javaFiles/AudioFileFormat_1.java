import javax.sound.sampled.AudioFileFormat;
import java.io.File;
import java.io.IOException;

public class AudioFileFormat_1 {
    public static void main(String[] args) {
        File audioFile = new File("audio.wav");

        try {
            AudioFileFormat fileFormat = AudioSystem.getAudioFileFormat(audioFile);
            AudioFileFormat.Type fileType = fileFormat.getType();
            System.out.println("Audio file type: " + fileType);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
