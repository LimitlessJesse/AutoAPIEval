import javax.sound.sampled.*;

public class Line_Info_2 {
    public static void main(String[] args) {
        Line.Info info = new Line.Info(TargetDataLine.class);
        boolean matches = AudioSystem.isLineSupported(info);
        System.out.println("Is TargetDataLine supported: " + matches);
    }
}
