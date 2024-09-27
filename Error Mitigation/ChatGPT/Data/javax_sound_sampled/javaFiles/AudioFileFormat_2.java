import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_2 {
    public static void main(String[] args) {
        AudioFileFormat audioFileFormat = new AudioFileFormat();
        int frameLength = audioFileFormat.getFrameLength();
        System.out.println("Frame Length: " + frameLength);
    }
}
