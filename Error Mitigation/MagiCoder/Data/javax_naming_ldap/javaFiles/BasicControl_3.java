import javax.naming.ldap.BasicControl;

public class BasicControl_3 {
    public static void main(String[] args) {
        BasicControl control = new BasicControl("1.2.3.4");
        String id = control.getID();
        System.out.println("Control ID: " + id);
    }
}
