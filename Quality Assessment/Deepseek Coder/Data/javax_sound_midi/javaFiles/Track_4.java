import javax.sound.midi.*;

public class Track_4 {
    public static void main(String[] args) {
        try {
            // Create a sequencer
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // Create a new track
            Track track = new Track();

            // Create a MidiEvent
            ShortMessage message = new ShortMessage();
            MidiEvent event = new MidiEvent(message, 100);

            // Add the MidiEvent to the track
            track.add(event);

            // Add the track to the sequencer
            sequencer.getSequence().getTracks()[0].add(event);

            // Start the sequencer
            sequencer.start();

        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
