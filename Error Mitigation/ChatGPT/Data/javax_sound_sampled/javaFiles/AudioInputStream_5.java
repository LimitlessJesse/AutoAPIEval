import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;

public class AudioInputStream_5 {
    public static void main(String[] args) {
        AudioInputStream audioInputStream = new AudioInputStream(); // create an instance of AudioInputStream
        AudioFormat format = audioInputStream.getFormat(); // get the audio format
        System.out.println("Audio Format: " + format.toString());
    }
}
