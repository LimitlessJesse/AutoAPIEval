import javax.sound.sampled.spi.AudioFileWriter;
import javax.sound.sampled.AudioFileFormat;

public class AudioFileWriter_3 {
    public static void main(String[] args) {
        AudioFileWriter audioFileWriter = new AudioFileWriter() {
            @Override
            public AudioFileFormat.Type[] getAudioFileTypes() {
                return new AudioFileFormat.Type[0]; // Implement your logic here
            }
        };
        AudioFileFormat.Type[] audioFileTypes = audioFileWriter.getAudioFileTypes();
        System.out.println("Available audio file types:");
        for (AudioFileFormat.Type type : audioFileTypes) {
            System.out.println(type);
        }
    }
}
