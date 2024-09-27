import java.util.BitSet;

public class BitSet_3 {
    public static void main(String[] args) {
        BitSet bitset = new BitSet();

        // set some bits
        for (int i = 0; i < 10; i++) {
            bitset.set(i);
        }

        System.out.println("Before clear: " + bitset);

        // clear bit at index 5
        bitset.clear(5);

        System.out.println("After clear: " + bitset);
    }
}
