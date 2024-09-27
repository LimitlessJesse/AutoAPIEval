import javax.naming.ldap.SortKey;

public class SortKey_2 {
    public static void main(String[] args) {
        SortKey sortKey = new SortKey("name");
        boolean ascending = sortKey.isAscending();
        System.out.println("Is ascending: " + ascending);
    }
}
