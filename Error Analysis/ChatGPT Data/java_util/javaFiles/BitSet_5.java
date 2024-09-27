import java.util.BitSet;

public class BitSet_5 {
    public static void main(String[] args) {
        BitSet bits = new BitSet(8);
        bits.set(2);
        System.out.println("Before flip: " + bits);

        flip(bits, 2);
        System.out.println("After flip: " + bits);
    }

    public static void flip(BitSet bits, int bitIndex) {
        bits.flip(bitIndex);
    }
}
