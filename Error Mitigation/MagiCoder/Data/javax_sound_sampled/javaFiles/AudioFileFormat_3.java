import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;

public class AudioFileFormat_3 {
    public static void main(String[] args) {
        AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
        int lengthInBytes = 10000;
        int lengthInFrames = AudioSystem.NOT_SPECIFIED;
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);

        AudioFileFormat audioFileFormat = new AudioFileFormat(fileType, format, lengthInBytes, lengthInFrames, null);

        int frameLength = audioFileFormat.getFrameLength();
        System.out.println("Frame Length: " + frameLength);
    }
}
