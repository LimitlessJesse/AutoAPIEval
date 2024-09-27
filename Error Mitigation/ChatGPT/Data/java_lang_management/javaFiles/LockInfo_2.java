import java.lang.management.LockInfo;

public class LockInfo_2 {
    public static void main(String[] args) {
        Object lock = new Object();
        LockInfo lockInfo = new LockInfo(lock);
        int identityHashCode = lockInfo.getIdentityHashCode();
        System.out.println("Identity Hash Code: " + identityHashCode);
    }
}
