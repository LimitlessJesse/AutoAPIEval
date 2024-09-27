import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_1 {
    public static void main(String[] args) {
        AudioFileFormat audioFileFormat = new AudioFileFormat();
        int byteLength = audioFileFormat.getByteLength();
        System.out.println("Byte length of the audio file: " + byteLength);
    }
}
