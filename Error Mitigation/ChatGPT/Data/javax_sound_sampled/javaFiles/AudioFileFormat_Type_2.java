import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_2 {
    public static void main(String[] args) {
        AudioFileFormat.Type type1 = new AudioFileFormat.Type("WAVE", "wav");
        AudioFileFormat.Type type2 = new AudioFileFormat.Type("WAVE", "wav");

        boolean result = type1.equals(type2);
        System.out.println("Are type1 and type2 equal? " + result);
    }
}
