import java.util.BitSet;

public class BitSet_5 {
    public static void main(String[] args) {
        BitSet bitset = new BitSet();
        bitset.set(0);
        bitset.set(1);
        bitset.set(2);
        bitset.set(4);
        bitset.set(8);
        bitset.set(16);

        int nextClearBit = bitset.nextClearBit(0);
        System.out.println("The next clear bit from index 0 is: " + nextClearBit);
    }
}
