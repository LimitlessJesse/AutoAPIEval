import javax.sound.midi.Sequence;
import javax.sound.midi.spi.MidiFileWriter;

import java.io.IOException;
import java.io.OutputStream;

public class MidiFileWriter_4 {
    public static void main(String[] args) {
        MidiFileWriter midiFileWriter = new MidiFileWriter() {
            @Override
            public int write(Sequence in, int fileType, OutputStream out) throws IOException {
                // Implementation of the write method
                return 0;
            }

            @Override
            public boolean isFileTypeSupported(int fileType, Sequence sequence) {
                return false;
            }

            @Override
            public int[] getMidiFileTypes(Sequence sequence) {
                return new int[0];
            }
        };
    }
}
