import javax.naming.ldap.BasicControl;

public class BasicControl_2 {
    public static void main(String[] args) {
        BasicControl control = new BasicControl("exampleControl");
        String id = control.getID();
        System.out.println("Control ID: " + id);
    }
}
