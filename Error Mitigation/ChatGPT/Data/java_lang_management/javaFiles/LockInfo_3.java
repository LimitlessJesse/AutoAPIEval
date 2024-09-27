import java.lang.management.LockInfo;

public class LockInfo_3 {
    public static void main(String[] args) {
        LockInfo lock = new LockInfo(new Object(), 123);
        System.out.println(lock.toString());
    }
}
