import javax.sql.rowset.spi.SyncProvider;

public class SyncProvider_2 {
    public static void main(String[] args) {
        SyncProvider syncProvider = new SyncProviderImpl(); // Assuming SyncProviderImpl is a class implementing SyncProvider
        int providerGrade = syncProvider.getProviderGrade();
        System.out.println("Provider Grade: " + providerGrade);
    }
}
