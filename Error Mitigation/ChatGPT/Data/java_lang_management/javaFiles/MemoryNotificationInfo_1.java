import java.lang.management.MemoryNotificationInfo;

public class MemoryNotificationInfo_1 {
    public static void main(String[] args) {
        MemoryNotificationInfo info = new MemoryNotificationInfo() {
            @Override
            public String getPoolName() {
                return "ExampleMemoryPool";
            }
        };
        
        System.out.println("Memory pool name: " + info.getPoolName());
    }
}
