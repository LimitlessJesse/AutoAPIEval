import javax.swing.SizeSequence;

public class SizeSequence_4 {
    public static void main(String[] args) {
        SizeSequence sizeSeq = new SizeSequence(5);
        for (int i = 0; i < sizeSeq.getSize(); i++) {
            System.out.println("Size at index " + i + ": " + sizeSeq.getSize(i));
        }
    }
}
