import javax.sound.midi.MidiEvent;

public class MidiEvent_2 {
    public static void main(String[] args) {
        // Create a MidiEvent
        MidiEvent event = new MidiEvent();
        
        // Set the tick value using setTick method
        event.setTick(100);
        
        // Display the tick value
        System.out.println("Tick value set: " + event.getTick());
    }
}
