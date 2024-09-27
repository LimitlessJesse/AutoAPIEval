import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;

public class AudioFileFormat_2 {
    public static void main(String[] args) {
        AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
        int lengthInBytes = AudioSystem.NOT_SPECIFIED;
        int lengthInFrames = AudioSystem.NOT_SPECIFIED;
        AudioFileFormat.Type type = AudioSystem.getAudioFileFormat(new java.io.File("path_to_your_audio_file")).getType();
        int byteLength = AudioSystem.getAudioFileFormat(new java.io.File("path_to_your_audio_file")).getByteLength();
        System.out.println("File type: " + type);
        System.out.println("File length in bytes: " + byteLength);
    }
}
