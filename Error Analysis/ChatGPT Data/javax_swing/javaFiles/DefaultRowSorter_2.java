import javax.swing.DefaultRowSorter;

public class DefaultRowSorter_2 {
    public static void main(String[] args) {
        DefaultRowSorter sorter = new DefaultRowSorter();
        sorter.setSortable(0, true);
        System.out.println("Sorting enabled for column 0");
    }
}
