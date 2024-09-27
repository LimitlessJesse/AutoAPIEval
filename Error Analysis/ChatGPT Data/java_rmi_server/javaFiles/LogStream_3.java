import java.rmi.server.LogStream;
import java.rmi.server.LogStream.DefaultLog;

public class LogStream_3 {
    public static void main(String[] args) {
        LogStream logStream = new DefaultLog();
        logStream.write(65); // Writing the ASCII value for 'A'
    }
}
