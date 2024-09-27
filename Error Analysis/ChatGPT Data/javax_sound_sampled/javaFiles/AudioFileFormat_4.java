import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_4 {
    public static void main(String[] args) {
        AudioFileFormat audioFileFormat = new AudioFileFormat(Encoding = AudioFormat.Encoding.PCM_SIGNED, SampleRate = 44100, FrameRate = 30, FrameLength = 60000, Format = AudioFormat);

        int frameLength = audioFileFormat.getFrameLength();
        System.out.println("Frame Length: " + frameLength);
    }
}
