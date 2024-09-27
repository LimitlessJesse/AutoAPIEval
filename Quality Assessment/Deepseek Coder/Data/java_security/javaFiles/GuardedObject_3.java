import java.security.GuardedObject;
import java.security.Policy;

public class GuardedObject_3 {
    public static void main(String[] args) {
        GuardedObject guardedObject = new GuardedObject();

        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                guardedObject.setObject("Hello, World!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println(guardedObject.getObject());
        });

        thread2.start();
    }
}
