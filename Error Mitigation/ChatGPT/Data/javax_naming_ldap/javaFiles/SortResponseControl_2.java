import javax.naming.ldap.SortResponseControl;

public class SortResponseControl_2 {
    public static void main(String[] args) {
        SortResponseControl control = new SortResponseControl("attributeID", true, true);
        String attributeID = control.getAttributeID();
        System.out.println("Attribute ID: " + attributeID);
    }
}
