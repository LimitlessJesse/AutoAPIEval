import javax.sound.midi.MidiEvent;

public class MidiEvent_2 {
    public static void main(String[] args) {
        MidiEvent midiEvent = new MidiEvent();
        long tick = midiEvent.getTick();
        System.out.println("Time-stamp for the event in MIDI ticks: " + tick);
    }
}
