import javax.naming.directory.SearchControls;

public class SearchControls_5 {
    public static void main(String[] args) {
        SearchControls controls = new SearchControls();
        controls.setDerefLinkFlag(true);
        System.out.println("Dereferencing link flag set to: " + controls.getDerefLinkFlag());
    }
}
