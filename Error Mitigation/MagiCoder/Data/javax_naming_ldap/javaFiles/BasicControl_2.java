import javax.naming.ldap.BasicControl;
import java.util.Arrays;

public class BasicControl_2 {
    public static void main(String[] args) {
        // Create a BasicControl object
        BasicControl control = new BasicControl("1.2.3.4", true, "test".getBytes());

        // Get the encoded value
        byte[] encodedValue = control.getEncodedValue();

        // Print the encoded value
        System.out.println(Arrays.toString(encodedValue));
    }
}
