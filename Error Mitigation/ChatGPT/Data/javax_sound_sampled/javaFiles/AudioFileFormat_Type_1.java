import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_1 {
    public static void main(String[] args) {
        AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
        String fileTypeName = fileType.toString();
        System.out.println("File type name: " + fileTypeName);
    }
}
