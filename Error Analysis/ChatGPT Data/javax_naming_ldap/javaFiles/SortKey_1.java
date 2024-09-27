import javax.naming.ldap.SortKey;

public class SortKey_1 {
    public static void main(String[] args) {
        SortKey sortKey = new SortKey("attributeName");
        String attributeID = sortKey.getAttributeID();
        System.out.println("Attribute ID: " + attributeID);
    }
}
