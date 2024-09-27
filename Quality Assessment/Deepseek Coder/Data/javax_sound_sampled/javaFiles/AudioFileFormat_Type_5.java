import javax.sound.sampled.AudioFileFormat;

public class AudioFileFormat_Type_5 {
    public static void main(String[] args) {
        AudioFileFormat.Type type1 = AudioFileFormat.Type.AIFF;
        AudioFileFormat.Type type2 = AudioFileFormat.Type.AIFF;
        AudioFileFormat.Type type3 = AudioFileFormat.Type.WAVE;

        boolean isEqual1 = type1.equals(type2); // true
        boolean isEqual2 = type1.equals(type3); // false

        System.out.println("Is type1 equal to type2? " + isEqual1);
        System.out.println("Is type1 equal to type3? " + isEqual2);
    }
}
