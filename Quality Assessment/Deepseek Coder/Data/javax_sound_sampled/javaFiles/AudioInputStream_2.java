import javax.sound.sampled.*;
import java.io.IOException;

public class AudioInputStream_2 {
    public static void main(String[] args) {
        try {
            // Create an AudioInputStream from an audio file
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(AudioInputStream_2.class.getResource("/path/to/your/audio/file.wav"));

            // Create a buffer to hold the audio data
            byte[] buffer = new byte[1024];

            // Read the audio data into the buffer
            int bytesRead = audioInputStream.read(buffer, 0, buffer.length);

            // Print the number of bytes read
            System.out.println("Bytes read: " + bytesRead);

            // Close the AudioInputStream
            audioInputStream.close();
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
