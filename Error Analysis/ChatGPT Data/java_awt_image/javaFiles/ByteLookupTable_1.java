import java.awt.image.ByteLookupTable;

public class ByteLookupTable_1 {
    public static void main(String[] args) {
        byte[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ByteLookupTable table = new ByteLookupTable(0, data);
        byte[][] result = table.getTable();
        
        for (byte[] row : result) {
            for (byte value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
