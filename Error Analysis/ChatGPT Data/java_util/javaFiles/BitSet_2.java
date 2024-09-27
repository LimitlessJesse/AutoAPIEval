import java.util.BitSet;

public class BitSet_2 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(10);
        bitSet.set(2);
        System.out.println("Before clear: " + bitSet);

        clear(bitSet, 2);
        System.out.println("After clear: " + bitSet);
    }

    public static void clear(BitSet bitSet, int bitIndex) {
        bitSet.clear(bitIndex);
    }
}
