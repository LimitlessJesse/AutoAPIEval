import javax.naming.NamingException;
import javax.naming.ldap.SortResponseControl;

public class SortResponseControl_4 {
    public static void main(String[] args) {
        SortResponseControl sortResponseControl = new SortResponseControl();
        try {
            boolean sorted = sortResponseControl.isSorted();
            System.out.println("Search results sorted: " + sorted);
        } catch (NamingException e) {
            System.out.println("Error occurred during sorting: " + e.getMessage());
        }
    }
}
