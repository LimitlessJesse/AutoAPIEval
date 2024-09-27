import javax.naming.ldap.BasicControl;

public class BasicControl_2 {
    public static void main(String[] args) {
        BasicControl control = new BasicControl("1.2.840.113556.1.4.801", true, null);
        boolean isCritical = control.isCritical();
        System.out.println("Is Critical: " + isCritical);
    }
}
