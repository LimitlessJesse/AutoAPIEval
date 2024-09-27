import javax.sound.sampled.DataLine;

public class DataLine_Info_3 {
    public static void main(String[] args) {
        DataLine.Info info = new DataLine.Info(DataLine.class, null);
        AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, true);
        boolean isSupported = info.isFormatSupported(format);
        System.out.println("Is format supported: " + isSupported);
    }
}
