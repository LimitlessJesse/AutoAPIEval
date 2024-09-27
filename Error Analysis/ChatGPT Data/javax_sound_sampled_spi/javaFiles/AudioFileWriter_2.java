import javax.sound.sampled.spi.AudioFileWriter;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;

import java.io.OutputStream;

public class AudioFileWriter_2 {
    public static void main(String[] args) {
        AudioFileWriter audioFileWriter = new AudioFileWriter();
        AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
        OutputStream outputStream = System.out; // or any other output stream
        
        AudioInputStream inputStream = null; // initialize your AudioInputStream
        
        try {
            audioFileWriter.write(inputStream, fileType, outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
