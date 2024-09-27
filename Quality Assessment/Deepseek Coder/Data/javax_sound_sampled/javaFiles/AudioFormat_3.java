import javax.sound.sampled.AudioFormat;

public class AudioFormat_3 {
    public static void main(String[] args) {
        AudioFormat.Encoding encoding = AudioFormat.Encoding.PCM_SIGNED;
        float sampleRate = 44100;
        int channels = 2;
        int sampleSizeInBits = 16;
        boolean bigEndian = false;

        AudioFormat format = new AudioFormat(encoding, sampleRate, sampleSizeInBits, channels, (sampleSizeInBits * channels) / 8, sampleRate, bigEndian);

        int numChannels = format.getChannels();
        System.out.println("Number of channels: " + numChannels);
    }
}
