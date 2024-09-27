import java.lang.management.LockInfo;

public class LockInfo_2 {
    public static void main(String[] args) {
        LockInfo lockInfo = new LockInfo("ClassName", 123);
        int identityHashCode = lockInfo.getIdentityHashCode();
        System.out.println("Identity Hash Code: " + identityHashCode);
    }
}
