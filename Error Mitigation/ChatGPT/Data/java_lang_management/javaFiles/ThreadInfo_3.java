import java.lang.management.ThreadInfo;

public class ThreadInfo_3 {
    public static void main(String[] args) {
        ThreadInfo threadInfo = new ThreadInfo();
        Thread.State state = threadInfo.getThreadState();
        System.out.println("Thread state: " + state);
    }
}
