import javax.sound.sampled.AudioInputStream;

public class AudioInputStream_1 {
    public static void main(String[] args) {
        AudioInputStream audioInputStream = null;
        try {
            int bytesAvailable = audioInputStream.available();
            System.out.println("Bytes available: " + bytesAvailable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
