import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;

public class AudioSystem_3 {
    public static void main(String[] args) {
        Line.Info info = new Line.Info(TargetDataLine.class); // Example: TargetDataLine.class can be replaced with any other Line type
        Line.Info[] targetLineInfo = AudioSystem.getTargetLineInfo(info);
        
        for (Line.Info lineInfo : targetLineInfo) {
            System.out.println(lineInfo);
        }
    }
}
