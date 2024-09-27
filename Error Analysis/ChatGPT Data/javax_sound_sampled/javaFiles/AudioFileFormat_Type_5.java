import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_5 {
    public static void main(String[] args) {
        AudioFileFormat.Type audioFileType = AudioFileFormat.Type.WAVE;
        String fileTypeString = audioFileType.toString();
        System.out.println("File type: " + fileTypeString);
    }
}
