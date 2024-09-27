import javax.naming.directory.SearchControls;

public class SearchControls_1 {
    public static void main(String[] args) {
        SearchControls searchControls = new SearchControls();
        String[] attributes = {"attribute1", "attribute2"};
        searchControls.setReturningAttributes(attributes);
    }
}
