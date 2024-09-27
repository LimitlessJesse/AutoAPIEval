import javax.swing.UIDefaults;
import javax.swing.UIDefaults.ProxyLazyValue;

public class UIDefaults_ProxyLazyValue_1 {
    public static void main(String[] args) {
        UIDefaults table = new UIDefaults();
        
        ProxyLazyValue proxyLazyValue = new ProxyLazyValue("javax.swing.UIDefaults$ActiveValue",
                "createValue", new Object[] {table});
        
        Object createdValue = proxyLazyValue.createValue(table);
        
        System.out.println(createdValue); // Print out the created value
    }
}
