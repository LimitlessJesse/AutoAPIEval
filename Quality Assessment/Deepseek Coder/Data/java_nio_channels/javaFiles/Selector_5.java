import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.atomic.AtomicInteger;

public class Selector_5 {
    public static void main(String[] args) throws Exception {
        SelectorProvider provider = SelectorProvider.provider();
        Selector selector = provider.openSelector();

        AtomicInteger count = new AtomicInteger(0);

        Thread thread = new Thread(() -> {
            try {
                while (count.get() < 5) {
                    if (selector.selectNow() == 0) {
                        System.out.println("No channels ready");
                        Thread.sleep(1000);
                    } else {
                        System.out.println("Channel ready");
                        count.incrementAndGet();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        thread.start();

        Thread.sleep(2000);

        System.out.println("Waking up thread");
        selector.wakeup();

        thread.join();
    }
}
