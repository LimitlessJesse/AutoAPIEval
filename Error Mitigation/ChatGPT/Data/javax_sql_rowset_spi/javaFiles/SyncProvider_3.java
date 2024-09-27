import javax.sql.rowset.spi.SyncProvider;

public class SyncProvider_3 {
    public static void main(String[] args) {
        SyncProvider syncProvider = new SyncProvider() {
            @Override
            public String getProviderID() {
                return this.getClass().getName();
            }
        };
        
        System.out.println(syncProvider.getProviderID());
    }
}
