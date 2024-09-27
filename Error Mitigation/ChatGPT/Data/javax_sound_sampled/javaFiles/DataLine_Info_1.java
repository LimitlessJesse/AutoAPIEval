import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.DataLine;

public class DataLine_Info_1 {
    public static void main(String[] args) {
        DataLine.Info info = new DataLine.Info(DataLine.class, new AudioFormat(44100, 16, 2, true, false));
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        
        boolean isSupported = info.isFormatSupported(format);
        System.out.println("Is format supported: " + isSupported);
    }
}
