import javax.net.ssl.TrustManagerFactorySpi;
import javax.net.ssl.TrustManager;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

public class TrustManagerFactorySpi_6 {
    public static void main(String[] args) {
        try {
            // Create an instance of TrustManagerFactorySpi
            TrustManagerFactorySpi trustManagerFactorySpi = new TrustManagerFactorySpi();

            // Get the Method object for the engineGetTrustManagers method
            Method method = TrustManagerFactorySpi.class.getDeclaredMethod("engineGetTrustManagers");

            // Make the method accessible
            method.setAccessible(true);

            // Call the method and get the TrustManager array
            TrustManager[] trustManagers = (TrustManager[]) method.invoke(trustManagerFactorySpi);

            // Print the TrustManager array
            for (TrustManager trustManager : trustManagers) {
                System.out.println(trustManager);
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
