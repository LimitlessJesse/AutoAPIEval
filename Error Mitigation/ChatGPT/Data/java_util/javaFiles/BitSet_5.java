import java.util.BitSet;

public class BitSet_5 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(2); // Set bit at index 2 to true
        System.out.println("Before flipping: " + bitSet);
        
        bitSet.flip(2); // Flip the bit at index 2
        System.out.println("After flipping: " + bitSet);
    }
}
