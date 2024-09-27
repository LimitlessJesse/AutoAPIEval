import java.util.BitSet;

public class BitSet_4 {
    public static void main(String[] args) {
        BitSet bitset = new BitSet();
        bitset.set(0);
        bitset.set(1);
        bitset.set(2);
        bitset.set(4);
        bitset.set(8);

        int nextSetBit = bitset.nextSetBit(0);
        System.out.println(nextSetBit);
    }
}
