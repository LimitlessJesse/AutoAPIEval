import javax.naming.directory.SearchControls;

public class SearchControls_3 {
    public static void main(String[] args) {
        SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
        System.out.println("Search scope set to: " + searchControls.getSearchScope());
    }
}
