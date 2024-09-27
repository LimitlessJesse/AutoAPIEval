import javax.naming.ldap.PagedResultsResponseControl;

public class PagedResultsResponseControl_1 {
    public static void main(String[] args) {
        PagedResultsResponseControl control = new PagedResultsResponseControl();
        int resultSize = control.getResultSize();
        System.out.println("Result size: " + resultSize);
    }
}
