import javax.naming.directory.SearchControls;

public class SearchControls_1 {
    public static void main(String[] args) {
        SearchControls controls = new SearchControls();
        controls.setTimeLimit(5000); // Setting a time limit of 5 seconds
        System.out.println("Time Limit: " + controls.getTimeLimit());
    }
}
