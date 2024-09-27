import java.lang.management.LockInfo;

public class LockInfo_4 {
    public static void main(String[] args) {
        LockInfo lockInfo = new LockInfo("ClassName", 123);
        System.out.println(lockInfo.toString());
    }
}
