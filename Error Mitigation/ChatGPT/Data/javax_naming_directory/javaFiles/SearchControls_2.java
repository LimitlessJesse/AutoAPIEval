import javax.naming.directory.SearchControls;

public class SearchControls_2 {
    public static void main(String[] args) {
        SearchControls controls = new SearchControls();
        controls.setReturningObjFlag(true); // Enable returning objects
        System.out.println("Returning objects flag set to: " + controls.getReturningObjFlag());
    }
}
