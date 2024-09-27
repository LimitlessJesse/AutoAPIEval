import java.util.concurrent.FutureTask;

public class FutureTask_5 {
    public static void main(String[] args) {
        FutureTask<Void> task = new FutureTask<>(FutureTask_5::doSomething);
        new Thread(task).start();
    }

    private static Void doSomething() {
        System.out.println("Doing something...");
        return null;
    }
}
