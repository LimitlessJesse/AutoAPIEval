import javax.naming.ldap.Control;
import javax.naming.ldap.BasicControl;

public class BasicControl_1 {
    public static void main(String[] args) {
        Control control = new BasicControl("exampleControl", true, new byte[]{0x01, 0x02, 0x03});
        byte[] encodedValue = control.getEncodedValue();
        System.out.println("Encoded Value: " + encodedValue);
    }
}
