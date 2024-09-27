import javax.sound.sampled.AudioFormat;

public class AudioFormat_5 {
    public static void main(String[] args) {
        AudioFormat audioFormat = new AudioFormat(44100, 16, 2, true, false);
        float frameRate = audioFormat.getFrameRate();
        System.out.println("Frame rate: " + frameRate);
    }
}
