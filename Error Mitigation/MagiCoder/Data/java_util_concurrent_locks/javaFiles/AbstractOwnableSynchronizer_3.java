import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class AbstractOwnableSynchronizer_3 {
    public static void main(String[] args) {
        AbstractOwnableSynchronizer synchronizer = new AbstractOwnableSynchronizer();
        Thread ownerThread = synchronizer.getExclusiveOwnerThread();
        System.out.println("Exclusive Owner Thread: " + ownerThread);
    }
}
