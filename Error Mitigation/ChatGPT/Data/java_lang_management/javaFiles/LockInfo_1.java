import java.lang.management.LockInfo;

public class LockInfo_1 {
    public static void main(String[] args) {
        LockInfo lockInfo = new LockInfo("java.lang.Object", 123);
        String className = lockInfo.getClassName();
        System.out.println("Class Name: " + className);
    }
}
