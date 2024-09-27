import javax.naming.ldap.BasicControl;

public class BasicControl_3 {
    public static void main(String[] args) {
        BasicControl control = new BasicControl("controlID", true, null);
        boolean isCritical = control.isCritical();
        System.out.println("Is control critical? " + isCritical);
    }
}
