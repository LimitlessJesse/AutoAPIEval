import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_1 {
    public static void main(String[] args) {
        AudioFileFormat.Type audioType = AudioFileFormat.Type.WAVE;
        String extension = audioType.getExtension();
        System.out.println("Extension: " + extension);
    }
}
