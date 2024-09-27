import javax.naming.ldap.SortResponseControl;

public class SortResponseControl_2 {
    public static void main(String[] args) {
        // Assuming you have a SortResponseControl object named control
        SortResponseControl control = new SortResponseControl();
        
        // Using the isSorted() method to check if the response control is sorted
        boolean sorted = control.isSorted();
        
        System.out.println("Is sorted: " + sorted);
    }
}
