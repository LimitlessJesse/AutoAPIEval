import javax.naming.ldap.SortKey;

public class SortKey_4 {
    public static void main(String[] args) {
        SortKey sortKey = new SortKey("cn");
        boolean ascending = sortKey.isAscending();
        System.out.println("Is ascending: " + ascending);
    }
}
