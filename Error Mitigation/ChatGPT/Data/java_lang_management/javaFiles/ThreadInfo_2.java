import java.lang.management.ThreadInfo;

public class ThreadInfo_2 {
    public static void main(String[] args) {
        ThreadInfo threadInfo = new ThreadInfo();
        String threadName = threadInfo.getThreadName();
        System.out.println("Thread Name: " + threadName);
    }
}
