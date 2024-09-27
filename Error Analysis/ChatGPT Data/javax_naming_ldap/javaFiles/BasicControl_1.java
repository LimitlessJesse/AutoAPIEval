import javax.naming.ldap.BasicControl;

public class BasicControl_1 {
    public static void main(String[] args) {
        BasicControl control = new BasicControl("1.2.840.113556.1.4.643");
        byte[] encodedValue = control.getEncodedValue();
        
        System.out.println("Encoded value length: " + encodedValue.length);
    }
}
