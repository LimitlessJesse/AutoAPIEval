import javax.sound.sampled.*;

public class AudioSystem_5 {
    public static void main(String[] args) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Main.class.getResource("sample.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            clip.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
