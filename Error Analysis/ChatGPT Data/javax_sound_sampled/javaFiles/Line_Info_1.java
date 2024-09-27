import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

public class Line_Info_1 {
    public static void main(String[] args) {
        try {
            Mixer.Info[] mixerInfos = AudioSystem.getMixerInfo();
            for (Mixer.Info mixerInfo : mixerInfos) {
                Mixer mixer = AudioSystem.getMixer(mixerInfo);
                Line.Info[] sourceLineInfos = mixer.getSourceLineInfo();
                for (Line.Info sourceLineInfo : sourceLineInfos) {
                    Class<?> lineClass = sourceLineInfo.getLineClass();
                    System.out.println("Source Line Class: " + lineClass.getName());
                }
            }
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
