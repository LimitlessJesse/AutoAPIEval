import javax.sound.midi.SysexMessage;

public class SysexMessage_5 {
    public static void main(String[] args) {
        // Create a SysexMessage object
        SysexMessage originalMessage = new SysexMessage();

        try {
            // Create a clone of the original SysexMessage object
            SysexMessage clonedMessage = (SysexMessage) originalMessage.clone();
            
            // Display the hashCode of the original and cloned objects to show they are different instances
            System.out.println("Original hashCode: " + originalMessage.hashCode());
            System.out.println("Cloned hashCode: " + clonedMessage.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
