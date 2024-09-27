import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_4 {
    public static void main(String[] args) {
        AudioFileFormat.Type type = AudioFileFormat.Type.WAVE;
        String extension = type.getExtension();
        System.out.println("The extension for the type " + type + " is: " + extension);
    }
}
