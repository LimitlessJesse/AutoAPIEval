import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;

public class AudioSystem_2 {
    public static void main(String[] args) {
        Line.Info[] sourceLines = AudioSystem.getSourceLineInfo(new Line.Info(SourceDataLine.class));
        
        for (Line.Info lineInfo : sourceLines) {
            System.out.println("Source Line: " + lineInfo);
        }
    }
}
