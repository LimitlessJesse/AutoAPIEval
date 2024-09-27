import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_4 {
    public static void main(String[] args) {
        AudioFileFormat.Type[] types = AudioFileFormat.Type.values();
        for (AudioFileFormat.Type type : types) {
            System.out.println(type.toString());
        }
    }
}
