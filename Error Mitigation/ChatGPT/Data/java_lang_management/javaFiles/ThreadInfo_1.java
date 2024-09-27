import java.lang.management.ThreadInfo;

public class ThreadInfo_1 {
    public static void main(String[] args) {
        ThreadInfo threadInfo = new ThreadInfo();
        long threadId = threadInfo.getThreadId();
        System.out.println("Thread ID: " + threadId);
    }
}
