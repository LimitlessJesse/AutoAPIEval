import javax.sound.sampled.spi.FormatConversionProvider;
import javax.sound.sampled.AudioFormat;

public class FormatConversionProvider_1 {
    public static void main(String[] args) {
        FormatConversionProvider provider = new FormatConversionProvider(); // Instantiate FormatConversionProvider
        
        AudioFormat.Encoding targetEncoding = AudioFormat.Encoding.PCM_SIGNED; // Set target encoding
        AudioFormat sourceFormat = new AudioFormat(44100, 16, 2, true, false); // Create a source AudioFormat
        
        AudioFormat[] targetFormats = provider.getTargetFormats(targetEncoding, sourceFormat); // Get supported target formats
        
        // Print out the supported target formats
        for (AudioFormat format : targetFormats) {
            System.out.println(format.toString());
        }
    }
}
