import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Applet_1 {
    public static void main(String[] args) {
        URL url = Main.class.getResource("audio.wav"); // Replace "audio.wav" with your actual audio file path
        AudioClip audioClip = Applet.newAudioClip(url);
        
        // Play the audio clip
        audioClip.play();
    }
}
