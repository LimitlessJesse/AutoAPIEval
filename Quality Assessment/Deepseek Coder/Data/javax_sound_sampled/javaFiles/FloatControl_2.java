import javax.sound.sampled.*;

public class FloatControl_2 {
    public static void main(String[] args) {
        try {
            // Create a line
            Line line = AudioSystem.getLine(new Line.Info(Clip.class));
            Clip clip = (Clip) line;

            // Create a FloatControl
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

            // Get the current value of the FloatControl
            float currentValue = gainControl.getValue();

            // Print the current value
            System.out.println("Current value: " + currentValue);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
