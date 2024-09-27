import javax.sound.sampled.spi.AudioFileWriter;
import javax.sound.sampled.AudioFileFormat;

public class AudioFileWriter_5 {
    public static void main(String[] args) {
        AudioFileWriter audioFileWriter = new AudioFileWriter();
        AudioFileFormat.Type fileType = new AudioFileFormat.Type("WAVE", "wav");
        boolean isSupported = audioFileWriter.isFileTypeSupported(fileType);
        System.out.println("Is WAVE file type supported? " + isSupported);
    }
}
