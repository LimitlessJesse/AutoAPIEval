import javax.naming.directory.SearchControls;

public class SearchControls_2 {
    public static void main(String[] args) {
        SearchControls searchControls = new SearchControls();
        searchControls.setTimeLimit(5000); // Set time limit to 5 seconds
        System.out.println("Time limit set to: " + searchControls.getTimeLimit());
    }
}
