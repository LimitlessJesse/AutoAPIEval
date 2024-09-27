import javax.sound.sampled.spi.FormatConversionProvider;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class FormatConversionProvider_4 {
    public static void main(String[] args) {
        File inputFile = new File("input.wav");

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputFile);
            Encoding targetEncoding = Encoding.PCM_SIGNED;
            AudioInputStream convertedStream = FormatConversionProvider.provider().getAudioInputStream(targetEncoding, audioInputStream);
            // Use the convertedStream for further processing
            System.out.println("Audio conversion successful.");
        } catch (UnsupportedAudioFileException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
