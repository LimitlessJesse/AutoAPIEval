import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;

public class AudioFileFormat_2 {
    public static void main(String[] args) {
        AudioFormat format = AudioSystem.getAudioFileFormat("your_audio_file_path").getFormat();
        System.out.println(format);
    }
}
