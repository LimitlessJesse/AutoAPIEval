import javax.naming.spi.InitialContextFactoryBuilder;
import javax.naming.spi.NamingManager;

public class NamingManager_4 {
    public static void main(String[] args) {
        InitialContextFactoryBuilder builder = new CustomInitialContextFactoryBuilder();
        NamingManager.setInitialContextFactoryBuilder(builder);
    }
}
