import javax.swing.SortingFocusTraversalPolicy;
import javax.swing.JComponent;
import java.util.Comparator;

public class SortingFocusTraversalPolicy_3 {
    public static void main(String[] args) {
        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();
        Comparator<? super JComponent> comparator = policy.getComparator();
        System.out.println(comparator);
    }
}
