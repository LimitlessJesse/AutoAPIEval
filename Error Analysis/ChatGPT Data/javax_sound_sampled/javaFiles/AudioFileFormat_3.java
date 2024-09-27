import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_3 {
    public static void main(String[] args) {
        AudioFileFormat audioFileFormat = new AudioFileFormat(null, null, -1);
        int byteLength = audioFileFormat.getByteLength();
        System.out.println("Byte Length: " + byteLength);
    }
}
