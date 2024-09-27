import javax.sound.sampled.*;
import java.util.Arrays;

public class FormatConversionProvider_4 {
    public static void main(String[] args) {
        // Get all available FormatConversionProviders
        AudioSystem.getAudioFileFormatTypes();
        Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
        for (Mixer.Info info : mixerInfo) {
            Line.Info[] lineInfos = AudioSystem.getSourceLineInfo(info);
            for (Line.Info lineInfo : lineInfos) {
                if (lineInfo instanceof DataLine.Info) {
                    DataLine.Info dataLineInfo = (DataLine.Info) lineInfo;
                    if (dataLineInfo.lineClass == Clip.class) {
                        Line line = AudioSystem.getLine(dataLineInfo);
                        if (line instanceof Clip) {
                            Clip clip = (Clip) line;
                            // Get the supported input formats
                            AudioFormat[] sourceFormats = clip.getSupportedInputFormats();
                            // Get the supported output formats
                            AudioFormat[] targetFormats = clip.getSupportedOutputFormats();
                            // Get the target formats for a specific encoding
                            AudioFormat.Encoding targetEncoding = AudioFormat.Encoding.PCM_SIGNED;
                            for (AudioFormat sourceFormat : sourceFormats) {
                                AudioFormat[] targetFormatsForSource = clip.getTargetFormats(targetEncoding, sourceFormat);
                                System.out.println("Source format: " + sourceFormat);
                                System.out.println("Target formats: " + Arrays.toString(targetFormatsForSource));
                            }
                        }
                    }
                }
            }
        }
    }
}
