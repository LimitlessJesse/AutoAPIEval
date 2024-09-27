import javax.sound.sampled.Control;

public class Control_Type_2 {
    public static void main(String[] args) {
        Control.Type controlType1 = new Control.Type("Type1");
        Control.Type controlType2 = new Control.Type("Type1");
        
        // Using equals() method to compare two Control Types
        boolean isEqual = controlType1.equals(controlType2);
        
        System.out.println("Are controlType1 and controlType2 equal? " + isEqual);
    }
}
