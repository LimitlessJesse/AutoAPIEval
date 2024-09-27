import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_4 {
    public static void main(String[] args) {
        AudioFileFormat.Type type = AudioFileFormat.Type.WAVE;
        int hashCode = type.hashCode();
        System.out.println("HashCode of AudioFileFormat.Type.WAVE: " + hashCode);
    }
}
