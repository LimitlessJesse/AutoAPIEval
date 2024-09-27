import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousChannelGroup_5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        AsynchronousChannelGroup group = AsynchronousChannelGroup.withThreadPool(executor);
    }
}
