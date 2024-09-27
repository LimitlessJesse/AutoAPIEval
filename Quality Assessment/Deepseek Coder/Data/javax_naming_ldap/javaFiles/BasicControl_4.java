import javax.naming.ldap.BasicControl;

public class BasicControl_4 {
    public static void main(String[] args) {
        BasicControl control = new BasicControl();
        boolean isCritical = control.isCritical();
        System.out.println("Is the control critical? " + isCritical);
    }
}
