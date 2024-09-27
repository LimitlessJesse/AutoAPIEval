import javax.sound.sampled.spi.AudioFileWriter;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFileFormat;
import java.io.File;

public class AudioFileWriter_1 {
    public static void main(String[] args) {
        AudioFileWriter writer = new AudioFileWriter();
        AudioInputStream stream = new AudioInputStream();
        AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
        File out = new File("output.wav");
        
        writer.write(stream, fileType, out);
    }
}
