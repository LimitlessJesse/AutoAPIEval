import java.util.concurrent.Semaphore;

public class Semaphore_15 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1, true);
        System.out.println(semaphore.isFair());
    }
}
