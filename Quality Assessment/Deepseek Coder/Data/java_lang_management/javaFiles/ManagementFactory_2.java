import java.lang.management.ManagementFactory;
import java.lang.management.GarbageCollectorMXBean;
import java.util.List;

public class ManagementFactory_2 {
    public static void main(String[] args) {
        List<GarbageCollectorMXBean> gcBeans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean gcBean : gcBeans) {
            System.out.println("Name: " + gcBean.getName());
            System.out.println("Number of collections: " + gcBean.getCollectionCount());
            System.out.println("Collection time: " + gcBean.getCollectionTime() + " ms");
            System.out.println("Pool names: " + gcBean.getMemoryPoolNames());
            System.out.println();
        }
    }
}
