import java.awt.image.ByteLookupTable;

public class ByteLookupTable_3 {
    public static void main(String[] args) {
        int[] src = {10, 20, 30};
        int[] dst = new int[src.length];
        
        ByteLookupTable table = new ByteLookupTable(0, new byte[256]);
        table.lookupPixel(src, dst);
        
        for (int pixel : dst) {
            System.out.println(pixel);
        }
    }
}
