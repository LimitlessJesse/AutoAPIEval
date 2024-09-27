import java.lang.invoke.MutableCallSite;

public class MutableCallSite_3 {
    public static void main(String[] args) {
        MutableCallSite[] sites = new MutableCallSite[5];
        // Initialize MutableCallSite objects
        for (int i = 0; i < sites.length; i++) {
            sites[i] = new MutableCallSite(null);
        }

        // Call syncAll method to synchronize the target values of all MutableCallSite objects
        MutableCallSite.syncAll(sites);

        // Display the updated target values of all MutableCallSite objects
        for (int i = 0; i < sites.length; i++) {
            System.out.println("MutableCallSite[" + i + "] target value: " + sites[i].dynamicInvoker().getTarget());
        }
    }
}
