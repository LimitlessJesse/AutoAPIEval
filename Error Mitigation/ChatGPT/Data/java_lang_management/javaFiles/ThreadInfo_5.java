import java.lang.management.LockInfo;
import java.lang.management.ThreadInfo;

public class ThreadInfo_5 {
    public static void main(String[] args) {
        ThreadInfo threadInfo = new ThreadInfo(); // Assuming you have a ThreadInfo object
        LockInfo lockInfo = threadInfo.getLockInfo();
        
        if(lockInfo != null) {
            System.out.println("LockInfo: " + lockInfo.toString());
        } else {
            System.out.println("Thread is not blocked waiting for any object.");
        }
    }
}
