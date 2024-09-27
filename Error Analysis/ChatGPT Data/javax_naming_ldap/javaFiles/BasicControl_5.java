import javax.naming.ldap.BasicControl;

public class BasicControl_5 {
    public static void main(String[] args) {
        BasicControl control = new BasicControl("controlID");
        String controlID = control.getID();
        System.out.println("Control ID: " + controlID);
    }
}
