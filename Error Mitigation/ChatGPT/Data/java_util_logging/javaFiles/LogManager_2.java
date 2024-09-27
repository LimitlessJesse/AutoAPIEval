import java.util.Enumeration;
import java.util.logging.LogManager;

public class LogManager_2 {
    public static void main(String[] args) {
        Enumeration<String> loggerNames = LogManager.getLogManager().getLoggerNames();
        
        while (loggerNames.hasMoreElements()) {
            String loggerName = loggerNames.nextElement();
            System.out.println(loggerName);
        }
    }
}
