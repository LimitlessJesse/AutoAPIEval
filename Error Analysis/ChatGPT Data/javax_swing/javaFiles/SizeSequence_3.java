import javax.swing.SizeSequence;

public class SizeSequence_3 {
    public static void main(String[] args) {
        SizeSequence sizeSequence = new SizeSequence(3);
        System.out.println("Original Size: " + sizeSequence.getSize(1));
        
        // Set new size
        sizeSequence.setSize(1, 5);
        System.out.println("New Size: " + sizeSequence.getSize(1));
    }
}
