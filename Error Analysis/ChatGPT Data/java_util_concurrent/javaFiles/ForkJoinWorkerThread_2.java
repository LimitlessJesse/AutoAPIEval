import java.util.concurrent.ForkJoinWorkerThread;

public class ForkJoinWorkerThread_2 {
    public static void main(String[] args) {
        ForkJoinWorkerThread workerThread = new ForkJoinWorkerThread(null) {
            @Override
            public int getPoolIndex() {
                return super.getPoolIndex();
            }
        };
        int poolIndex = workerThread.getPoolIndex();
        System.out.println("Pool Index: " + poolIndex);
    }
}
