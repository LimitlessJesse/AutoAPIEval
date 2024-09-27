import javax.swing.DefaultRowSorter;

public class DefaultRowSorter_5 {
    public static void main(String[] args) {
        
    }

    public void toggleSortOrder(DefaultRowSorter sorter, int column) {
        if (sorter != null) {
            sorter.toggleSortOrder(column);
        }
    }
}
