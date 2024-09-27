import javax.swing.DefaultRowSorter;

public class DefaultRowSorter_3 {
    public static void main(String[] args) {
        DefaultRowSorter<Object, Object> rowSorter = new DefaultRowSorter<>();
        int index = 0; // Specify the index
        int modelIndex = rowSorter.convertRowIndexToModel(index);
        System.out.println("Model Index: " + modelIndex);
    }
}
