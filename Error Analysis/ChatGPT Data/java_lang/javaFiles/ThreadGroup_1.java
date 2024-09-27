import java.lang.ThreadGroup;

public class ThreadGroup_1 {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Group1");
        System.out.println("Active threads count: " + threadGroup.activeCount());
    }
}
