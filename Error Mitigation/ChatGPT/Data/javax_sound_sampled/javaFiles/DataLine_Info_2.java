import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.DataLine;

public class DataLine_Info_2 {
    public static void main(String[] args) {
        DataLine.Info info = new DataLine.Info(DataLine.class, new AudioFormat[0]);
        AudioFormat[] formats = info.getFormats();
        
        for (AudioFormat format : formats) {
            System.out.println(format);
        }
    }
}
