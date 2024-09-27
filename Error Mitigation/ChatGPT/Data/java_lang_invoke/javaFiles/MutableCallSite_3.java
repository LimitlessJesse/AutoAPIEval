import java.lang.invoke.MutableCallSite;

public class MutableCallSite_3 {
    public static void main(String[] args) {
        MutableCallSite[] sites = new MutableCallSite[2];
        // Initialize MutableCallSite objects in the array
        
        MutableCallSite.syncAll(sites);
    }
}
