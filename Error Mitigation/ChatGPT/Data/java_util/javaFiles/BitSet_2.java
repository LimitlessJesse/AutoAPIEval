import java.util.BitSet;

public class BitSet_2 {
    public static void main(String[] args) {
        BitSet bs = new BitSet(8);
        bs.set(2);
        System.out.println("Before clearing: " + bs);
        
        bs.clear(2);
        System.out.println("After clearing: " + bs);
    }
}
