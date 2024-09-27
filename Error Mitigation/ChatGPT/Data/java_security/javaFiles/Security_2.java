import java.security.Security;

public class Security_2 {
    public static void main(String[] args) {
        String algName = "AES";
        String propName = "keySize";
        
        String propertyValue = Security.getAlgorithmProperty(algName, propName);
        System.out.println("Property value for " + propName + " in algorithm " + algName + ": " + propertyValue);
    }
}
