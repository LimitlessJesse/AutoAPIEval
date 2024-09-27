import javax.naming.ldap.PagedResultsResponseControl;

public class PagedResultsResponseControl_2 {
    public static void main(String[] args) {
        PagedResultsResponseControl control = new PagedResultsResponseControl();
        byte[] cookie = control.getCookie();
        if(cookie != null) {
            System.out.println("Server-generated cookie: " + new String(cookie));
        } else {
            System.out.println("No more entries for the server to return.");
        }
    }
}
