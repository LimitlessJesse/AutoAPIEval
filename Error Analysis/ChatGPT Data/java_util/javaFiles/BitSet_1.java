import java.util.BitSet;

public class BitSet_1 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(10);
        System.out.println("Before setting bit: " + bitSet);

        // Set bit at index 5
        bitSet.set(5);

        System.out.println("After setting bit: " + bitSet);
    }
}
