import java.util.BitSet;

public class BitSet_1 {
    public static void main(String[] args) {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        bs.set(4);
        
        System.out.println("BitSet after setting bits at index 0, 2, and 4: " + bs);
    }
}
