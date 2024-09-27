import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_3 {
    public static void main(String[] args) {
        AudioFileFormat.Type type = AudioFileFormat.Type.WAVE;
        int hashCode = type.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
